
package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.ssnDeployment;




@Repository
public interface geoPointRepository extends JpaRepository<geoPoint, Long> {
    geoPoint findByiotliteObject(iotliteObject iotliteObject);
    geoPoint findByssnDeployment(ssnDeployment ssnDeployment);
    geoPoint findByiotlitecoverage(iotliteCoverage iotliteCoverage);
}