package com.SPMProject.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SPMProject.backend.jwt.JwtUserDetailsService;
import com.SPMProject.backend.repository.UserDao;
import com.SPMProject.backend.jwt.JwtTokenUtil;
import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.jwt.JwtRequest;
import com.SPMProject.backend.jwt.JwtResponse;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public DAOUser createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		System.out.println(authenticationRequest.getEmail());
		System.out.println(bcryptEncoder.encode(authenticationRequest.getPassword()));
		authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword());
		System.out.println(authenticationRequest.getEmail());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getEmail());

		final String token = jwtTokenUtil.generateToken(userDetails);
		DAOUser user = userDao.findByEmail(authenticationRequest.getEmail());
		System.out.println(user.getId());
		user.setToken(token);
		return user;
	}
	

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

