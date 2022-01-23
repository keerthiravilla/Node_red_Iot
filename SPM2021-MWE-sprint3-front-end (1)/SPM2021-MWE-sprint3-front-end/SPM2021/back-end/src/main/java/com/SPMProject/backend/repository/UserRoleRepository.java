package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}