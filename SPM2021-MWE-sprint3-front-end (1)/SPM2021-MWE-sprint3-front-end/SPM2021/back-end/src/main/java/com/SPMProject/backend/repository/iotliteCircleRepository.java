package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.iotliteCircle;
import com.SPMProject.backend.entityModel.iotliteCoverage;




@Repository
public interface iotliteCircleRepository extends JpaRepository<iotliteCircle, Long> {
    
   

}