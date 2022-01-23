package com.SPMProject.backend.interfaces;

import java.util.List;

import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;
import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.iotliteCircle;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteMetadata;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSensor;
import com.SPMProject.backend.entityModel.ssnSystem;

public interface DeviceInterface {



    ssnDevice findByssnSystem(ssnSystem ssnSystem);
    ssnDevice findByssnSensingDevice(ssnSensingDevice ssnSensingDevice);



    ssnSystem findByOwlThing(OwlThing OwlThing);

    List<iotliteAttribute> findAlliotliteAttributeByiotliteObject(iotliteObject iotliteObject);



   
  



}
