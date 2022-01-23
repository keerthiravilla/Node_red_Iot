package com.SPMProject.backend.service;

import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.interfaces.SsnDeploymentInterface;
import com.SPMProject.backend.repository.OwlThingRepository;
import com.SPMProject.backend.repository.ssnDeploymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value = "ssnDeploymentService")
public class SsnDeploymentService implements SsnDeploymentInterface{

    @Autowired
    private ssnDeploymentRepository ssnDeploymentRepository;

 

}
