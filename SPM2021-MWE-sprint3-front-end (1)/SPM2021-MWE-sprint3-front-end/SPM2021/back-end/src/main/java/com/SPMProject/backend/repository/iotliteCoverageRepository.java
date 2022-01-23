package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.ssnDevice;




@Repository
public interface iotliteCoverageRepository extends JpaRepository<iotliteCoverage, Long> {


}