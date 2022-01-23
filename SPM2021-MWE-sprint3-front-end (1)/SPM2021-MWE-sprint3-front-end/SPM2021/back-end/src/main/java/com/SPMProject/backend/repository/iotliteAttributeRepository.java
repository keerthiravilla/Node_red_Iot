package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.ssnDevice;




@Repository
public interface iotliteAttributeRepository extends JpaRepository<iotliteAttribute, Long> {
    iotliteAttribute findByssnDevice(ssnDevice ssnDevice);

    List<iotliteAttribute> findAlliotliteAttributeByiotliteObject(iotliteObject iotliteObject);

}