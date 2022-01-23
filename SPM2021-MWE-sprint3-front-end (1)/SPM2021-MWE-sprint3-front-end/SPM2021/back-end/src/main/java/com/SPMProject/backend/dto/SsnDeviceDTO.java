package com.SPMProject.backend.dto;

import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSystem;

public class SsnDeviceDTO {
    private long id;

    private String iotliteActuatingDevice;

    private String iotliteTagDevice;
    private IotLiteCoverageDTO iotliteCoverage;
    private IotLiteServiceDTO iotliteService;
	private SsnDeploymentDTO ssnDeployment;
	private ssnSensingDevice ssnSensingDevice;
    // private GeoPointDTO geoPoint;

    // public GeoPointDTO getGeoPoint() {
    //     return this.geoPoint;
    // }

    // public void setGeoPoint(GeoPointDTO geoPoint) {
    //     this.geoPoint = geoPoint;
    // }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIotliteActuatingDevice() {
        return this.iotliteActuatingDevice;
    }

    public void setIotliteActuatingDevice(String iotliteActuatingDevice) {
        this.iotliteActuatingDevice = iotliteActuatingDevice;
    }


    public String getIotliteTagDevice() {
        return this.iotliteTagDevice;
    }

    public void setIotliteTagDevice(String iotliteTagDevice) {
        this.iotliteTagDevice = iotliteTagDevice;
    }

    public IotLiteCoverageDTO getIotliteCoverage() {
        return this.iotliteCoverage;
    }

    public void setIotliteCoverage(IotLiteCoverageDTO iotliteCoverage) {
        this.iotliteCoverage = iotliteCoverage;
    }

    public IotLiteServiceDTO getIotliteService() {
        return this.iotliteService;
    }

    public void setIotliteService(IotLiteServiceDTO iotliteService) {
        this.iotliteService = iotliteService;
    }

    public SsnDeploymentDTO getSsnDeployment() {
        return this.ssnDeployment;
    }

    public void setSsnDeployment(SsnDeploymentDTO ssnDeployment) {
        this.ssnDeployment = ssnDeployment;
    }

    public ssnSensingDevice getSsnSensingDevice() {
        return this.ssnSensingDevice;
    }

    public void setSsnSensingDevice(ssnSensingDevice ssnSensingDevice) {
        this.ssnSensingDevice = ssnSensingDevice;
    }

}
