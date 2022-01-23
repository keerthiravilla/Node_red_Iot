package com.SPMProject.backend.service;

import java.util.List;

import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;
import com.SPMProject.backend.interfaces.OwlThingInterface;
import com.SPMProject.backend.repository.OwlThingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "owlThingService") 
public class OwlThingService implements OwlThingInterface{
    
	@Autowired
    private OwlThingRepository owlThingRepository;

    @Override
	public  OwlThing findBySubClassType(SubClassType SubClassType){
		return owlThingRepository.findBySubClassType(SubClassType);
	}

   @Override
	public   OwlThing findByDAOUser(DAOUser DAOUser){
		return owlThingRepository.findByDAOUser(DAOUser);
	}

    @Override
    public List<OwlThing> findAllOwlThingByDAOUser(DAOUser DAOUser) {
		return owlThingRepository.findAllOwlThingByDAOUser(DAOUser);
    }
}
