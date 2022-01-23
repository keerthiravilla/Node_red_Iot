package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.ssnDevice;




@Repository
public interface ssnDeploymentRepository extends JpaRepository<ssnDeployment, Long> {

}