package com.SPMProject.backend.dto;

import com.SPMProject.backend.entityModel.iotliteObject;

public class IotLiteAttributeDTO {
    private Long id;
    private String description;
    private SsnDeviceDTO ssnDevice;

    public SsnDeviceDTO getSsnDevice() {
        return this.ssnDevice;
    }

    public void setSsnDevice(SsnDeviceDTO ssnDevice) {
        this.ssnDevice = ssnDevice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
