package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSensor;




@Repository
public interface ssnSensingDeviceRepository extends JpaRepository<ssnSensingDevice, Long> {

    ssnSensingDevice findByssnSensor(ssnSensor ssnSensor);

}