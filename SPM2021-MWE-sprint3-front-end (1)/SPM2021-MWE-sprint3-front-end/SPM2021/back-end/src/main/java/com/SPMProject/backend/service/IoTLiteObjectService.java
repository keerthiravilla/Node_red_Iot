package com.SPMProject.backend.service;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.interfaces.IotLiteObjectInterface;
import com.SPMProject.backend.repository.OwlThingRepository;
import com.SPMProject.backend.repository.iotliteObjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value = "ioTLiteObjectService") 
public class IoTLiteObjectService implements IotLiteObjectInterface {

    @Autowired
    private iotliteObjectRepository iotliteObjectRepository;



    @Override
	public iotliteObject findByOwlThing(OwlThing OwlThing) {
		return iotliteObjectRepository.findByOwlThing(OwlThing);
	}
}
