package com.SPMProject.backend.interfaces;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnDevice;

public interface IotLiteServiceInterface {
    // iotliteService findByssnDevice(ssnDevice ssnDevice);
    iotliteService findByOwlThing(OwlThing OwlThing);
}
