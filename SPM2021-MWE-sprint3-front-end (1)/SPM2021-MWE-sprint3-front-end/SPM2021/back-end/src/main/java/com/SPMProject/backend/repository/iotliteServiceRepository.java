package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnDevice;




@Repository
public interface iotliteServiceRepository extends JpaRepository<iotliteService, Long> {
    iotliteService findByOwlThing(OwlThing OwlThing);

}