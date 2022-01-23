package com.SPMProject.backend.service;


import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.interfaces.IotLiteAttributeInterface;
import com.SPMProject.backend.repository.iotliteAttributeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "iotLiteAttributeService") 
public class IotLiteAttributeService implements IotLiteAttributeInterface{
    @Autowired
    private iotliteAttributeRepository iotliteAttributeRepository;

    @Override
	public iotliteAttribute findByssnDevice(ssnDevice ssnDevice) {
		return iotliteAttributeRepository.findByssnDevice(ssnDevice);
	}
}
