package com.SPMProject.backend.dto;

import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;
import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSystem;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnSensor;
import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.iotliteCircle;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteMetadata;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.DAOUser;

public class DeviceDTO {


    private OwlThingDTO owlThing;
    private IotLiteObjectDTO iotliteObject;

    private SubClassType SubClassType;
    private SsnDeviceDTO ssnDevice;

    private SsnSystemDTO ssnSystem;
    private GeoPointDTO geoPoint;
    private IotLiteServiceDTO iotLiteService;




    private DAOUser DAOUser ;


    
    public OwlThingDTO getOwlThing() {
        return owlThing;
    }

    public void setOwlThing(OwlThingDTO owlThing) {
        this.owlThing = owlThing;
    }

    public SubClassType getSubClassType() {
        return SubClassType;
    }

    public void setSubClassType(SubClassType subClassType) {
        this.SubClassType = subClassType;
    }

    public IotLiteObjectDTO getIotliteObject() {
        return iotliteObject;
    }

    public void setIotliteObject(IotLiteObjectDTO iotliteObject) {
        this.iotliteObject = iotliteObject;
    }

    public IotLiteServiceDTO getIotLiteService() {
        return this.iotLiteService;
    }

    public void setIotLiteService(IotLiteServiceDTO iotLiteService) {
        this.iotLiteService = iotLiteService;
    }

    
    public SsnSystemDTO getSsnSystem() {
        return ssnSystem;
    }

    public void setSsnSystem(SsnSystemDTO ssnSystem) {
        this.ssnSystem = ssnSystem;
    }



    public SsnDeviceDTO getSsnDevice() {
        return ssnDevice;
    }

    public void setSsnDevice(SsnDeviceDTO ssnDevice) {
        this.ssnDevice = ssnDevice;
    }


    public GeoPointDTO getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPointDTO geoPoint) {
        this.geoPoint = geoPoint;
    }

    public DAOUser getDAOUser() {
        return DAOUser;
    }

    public void setDAOUser(DAOUser dAOUser) {
        DAOUser = dAOUser;
    }



	public DeviceDTO() {

	}
	


}