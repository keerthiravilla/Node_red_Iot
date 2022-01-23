package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.SubClassType;




@Repository
public interface SubClassTypeRepository extends JpaRepository<SubClassType, Long> {

}