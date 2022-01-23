package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;

@Repository
public interface OwlThingRepository extends JpaRepository<OwlThing, Long> {

  OwlThing findBySubClassType(SubClassType SubClassType);

  OwlThing findByDAOUser(DAOUser DAOUser);

  List<OwlThing> findAllOwlThingByDAOUser(DAOUser DAOUser);
}