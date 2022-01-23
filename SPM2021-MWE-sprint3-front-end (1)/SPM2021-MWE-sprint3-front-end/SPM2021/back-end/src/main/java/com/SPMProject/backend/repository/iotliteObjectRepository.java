package com.SPMProject.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.iotliteObject;




@Repository
public interface iotliteObjectRepository extends JpaRepository<iotliteObject, Long> {
    //@Query(value="SELECT COUNT(*) FROM produit_ventes p INNER JOIN user u ON u.id=p.user_id where u.id= :owlThing", nativeQuery = true)
    iotliteObject findByOwlThing(OwlThing OwlThing);

}