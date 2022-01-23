package com.SPMProject.backend.interfaces;

import java.util.List;

import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;

public interface OwlThingInterface {
    OwlThing findByDAOUser(DAOUser DAOUser);
    OwlThing findBySubClassType(SubClassType SubClassType);
    List<OwlThing> findAllOwlThingByDAOUser(DAOUser DAOUser);


}
