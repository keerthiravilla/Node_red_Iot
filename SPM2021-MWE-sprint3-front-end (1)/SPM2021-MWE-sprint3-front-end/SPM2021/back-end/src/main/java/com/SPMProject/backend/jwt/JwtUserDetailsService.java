package com.SPMProject.backend.jwt;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.SPMProject.backend.repository.UserDao;
import com.SPMProject.backend.repository.UserRoleRepository;
import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.UserRole;
import com.SPMProject.backend.dto.UserDTO;


@Service(value = "userService") 
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRoleRepository userRoleRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		DAOUser user = userDao.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with email: " + email);
		}

		org.springframework.security.core.userdetails.User u = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthority(user));
		return u;
	}

	public DAOUser findByEmail(String email){
		System.out.println("entrooo");
		System.out.println(email);

		return userDao.findByEmail(email);
	}
	
	private Set<GrantedAuthority> getAuthority(DAOUser user) { 
        Set<GrantedAuthority> authorities = new HashSet<>();
		user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		});
		return authorities;
	}

	public List findAll() {
		List list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	public DAOUser save(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setName(user.getName());
		newUser.setSurname(user.getSurname());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		DAOUser saved = userDao.save(newUser);

		UserRole newUserRole = new UserRole();
		newUserRole.setRole_id(1);
		newUserRole.setUser_id(saved.getId());
		userRoleRepository.save(newUserRole);
		return saved;
	}

	public DAOUser updateUser(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setId(user.getId());
		newUser.setName(user.getName());
		newUser.setSurname(user.getSurname());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		DAOUser saved = userDao.save(newUser);
		return saved;
	}


}