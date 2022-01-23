package com.SPMProject.backend;

import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.jwt.JwtResponse;
import com.SPMProject.backend.jwt.JwtTokenUtil;
import com.SPMProject.backend.jwt.JwtUserDetailsService;
import com.SPMProject.backend.repository.UserDao;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



@SpringBootTest
@ActiveProfiles("test")
public class UserTest {
    @Autowired
    private UserDao userDaoRepository;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;
 

   @Test
   public void getUserTest() {
      DAOUser user = userDaoRepository.findAll().get(0);
      Assertions.assertEquals("user", user.getName());
   }

   // @Test
   // public void loginTest() throws Exception{
	// 	authenticate("user", "user");

	// 	final UserDetails userDetails = userDetailsService
	// 			.loadUserByUsername("user");
   //    final String token = jwtTokenUtil.generateToken(userDetails);
   //    Assertions.assertEquals(200, ResponseEntity.ok(new JwtResponse(token)).getStatusCodeValue());
   // }


	private void authenticate(String email, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}