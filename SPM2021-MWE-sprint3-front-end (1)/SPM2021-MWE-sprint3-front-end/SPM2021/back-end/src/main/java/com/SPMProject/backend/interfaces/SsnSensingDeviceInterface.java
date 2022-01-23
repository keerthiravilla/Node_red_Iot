package com.SPMProject.backend.interfaces;

import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSensor;

public interface SsnSensingDeviceInterface {
    ssnSensingDevice findByssnSensor(ssnSensor ssnSensor);
}
