package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.iotliteMetadata;
import com.SPMProject.backend.entityModel.ssnSensor;




@Repository
public interface iotliteMetadataRepository extends JpaRepository<iotliteMetadata, Long> {
 

}