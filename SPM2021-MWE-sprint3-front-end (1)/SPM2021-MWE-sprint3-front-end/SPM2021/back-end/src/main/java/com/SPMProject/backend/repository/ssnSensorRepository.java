package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.ssnSensor;




@Repository
public interface ssnSensorRepository extends JpaRepository<ssnSensor, Long> {


}