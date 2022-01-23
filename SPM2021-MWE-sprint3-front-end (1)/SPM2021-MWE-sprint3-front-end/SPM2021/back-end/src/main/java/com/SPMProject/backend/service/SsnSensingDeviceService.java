package com.SPMProject.backend.service;

import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSensor;
import com.SPMProject.backend.interfaces.SsnSensingDeviceInterface;
import com.SPMProject.backend.repository.ssnSensingDeviceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value = "ssnSensingDeviceService") 
public class SsnSensingDeviceService implements SsnSensingDeviceInterface{

    @Autowired
    private ssnSensingDeviceRepository ssnSensingDeviceRepository;
    
    @Override
	public ssnSensingDevice findByssnSensor(ssnSensor ssnSensor) {
		return ssnSensingDeviceRepository.findByssnSensor(ssnSensor);
	}



}
