package com.SPMProject.backend.service;

import com.SPMProject.backend.interfaces.DeviceInterface;

import java.util.List;

import com.SPMProject.backend.dto.DeviceDTO;
import com.SPMProject.backend.dto.ID;
import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;
import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.iotliteCircle;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteMetadata;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSensor;
import com.SPMProject.backend.entityModel.ssnSystem;
import com.SPMProject.backend.repository.OwlThingRepository;
import com.SPMProject.backend.repository.geoPointRepository;
import com.SPMProject.backend.repository.iotliteAttributeRepository;
import com.SPMProject.backend.repository.iotliteCircleRepository;
import com.SPMProject.backend.repository.iotliteCoverageRepository;
import com.SPMProject.backend.repository.iotliteMetadataRepository;

import com.SPMProject.backend.repository.ssnDeviceRepository;

import com.SPMProject.backend.repository.ssnSystemRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "deviceService") 
public class DeviceService implements DeviceInterface{



    @Autowired
    private iotliteAttributeRepository iotliteAttributeRepository;
    @Autowired
    private ssnDeviceRepository ssnDeviceRepository;
    

    @Autowired
    private ssnSystemRepository ssnSystemRepository;






	@Override
	public  List<iotliteAttribute> findAlliotliteAttributeByiotliteObject(iotliteObject iotliteObject) {
		return iotliteAttributeRepository.findAlliotliteAttributeByiotliteObject(iotliteObject);
	}




  
   
    

    
    @Override
	public ssnDevice findByssnSystem(ssnSystem ssnSystem) {
		return ssnDeviceRepository.findByssnSystem(ssnSystem);
	}
  
    @Override
	public ssnSystem findByOwlThing(OwlThing OwlThing) {
		return ssnSystemRepository.findByOwlThing(OwlThing);
	}


  


	@Override
	public ssnDevice findByssnSensingDevice(ssnSensingDevice ssnSensingDevice) {
		return ssnDeviceRepository.findByssnSensingDevice(ssnSensingDevice);
	}

    
   
    
}

