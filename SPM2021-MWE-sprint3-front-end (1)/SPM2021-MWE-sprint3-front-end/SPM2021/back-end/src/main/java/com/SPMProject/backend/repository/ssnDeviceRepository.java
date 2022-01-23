package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSystem;




@Repository
public interface ssnDeviceRepository extends JpaRepository<ssnDevice, Long> {

    ssnDevice findByssnSystem(ssnSystem ssnSystem);
    ssnDevice findByssnSensingDevice(ssnSensingDevice ssnSensingDevice);

}