package com.SPMProject.backend.service;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.interfaces.IotLiteServiceInterface;
import com.SPMProject.backend.repository.iotliteServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "iotLiteServiceService") 
public class IotLiteServiceService implements IotLiteServiceInterface{
    @Autowired
    private iotliteServiceRepository iotliteServiceRepository;

    @Override
	public iotliteService findByOwlThing(OwlThing OwlThing) {
		return iotliteServiceRepository.findByOwlThing(OwlThing);
	}
    
    // @Override
	// public iotliteService findByssnDevice(ssnDevice ssnDevice) {
	// 	return iotliteServiceRepository.findByssnDevice(ssnDevice);
	// }
}
