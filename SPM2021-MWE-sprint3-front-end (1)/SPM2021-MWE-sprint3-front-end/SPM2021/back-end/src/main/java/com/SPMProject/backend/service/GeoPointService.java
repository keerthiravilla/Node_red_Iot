package com.SPMProject.backend.service;

import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.interfaces.GeoPointInterface;
import com.SPMProject.backend.repository.geoPointRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "geoPointService") 
public class GeoPointService implements GeoPointInterface{
    @Autowired  
    private geoPointRepository geoPointRepository;
	@Override
	public geoPoint findByiotliteObject(iotliteObject iotliteObject) {
		return geoPointRepository.findByiotliteObject(iotliteObject);
	}
    @Override
	public  geoPoint findByssnDeployment(ssnDeployment ssnDeployment) {
		return geoPointRepository.findByssnDeployment(ssnDeployment);
	}
    @Override
	public geoPoint findByiotlitecoverage(iotliteCoverage iotliteCoverage) {
		return geoPointRepository.findByiotlitecoverage(iotliteCoverage);
	}

}
