package com.SPMProject.backend.interfaces;

import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.ssnDeployment;

public interface GeoPointInterface {
    geoPoint findByssnDeployment(ssnDeployment ssnDeployment);
    geoPoint findByiotliteObject(iotliteObject iotliteObject);
    geoPoint findByiotlitecoverage(iotliteCoverage iotliteCoverage);
}
