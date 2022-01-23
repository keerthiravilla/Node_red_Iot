package com.SPMProject.backend.interfaces;

import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.ssnDevice;

public interface IotLiteAttributeInterface {
    iotliteAttribute findByssnDevice(ssnDevice ssnDevice);

}
