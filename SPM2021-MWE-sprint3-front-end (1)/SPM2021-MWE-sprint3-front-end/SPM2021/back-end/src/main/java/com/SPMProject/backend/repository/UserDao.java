package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.DAOUser;


@Repository
public interface UserDao extends JpaRepository<DAOUser, Long> {
	
	DAOUser findByEmail(String email);
}
