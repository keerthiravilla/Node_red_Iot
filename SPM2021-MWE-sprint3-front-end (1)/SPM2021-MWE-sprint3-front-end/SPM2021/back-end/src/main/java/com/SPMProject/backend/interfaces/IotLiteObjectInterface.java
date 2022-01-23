package com.SPMProject.backend.interfaces;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.iotliteObject;

public interface IotLiteObjectInterface {
    iotliteObject findByOwlThing(OwlThing OwlThing);
}
