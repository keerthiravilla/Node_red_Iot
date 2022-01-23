package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.ssnSystem;




@Repository
public interface ssnSystemRepository extends JpaRepository<ssnSystem, Long> {

    ssnSystem findByOwlThing(OwlThing OwlThing);

}