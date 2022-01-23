package com.SPMProject.backend.dto;

import java.util.List;
import java.util.Set;

public class IotLiteObjectDTO {
    private long id;
    private String iotliteInterfaceDescription;
    private List<IotLiteAttributeDTO> iotLiteAttributeDTO;
    private GeoPointDTO geoPoint;

    public GeoPointDTO getGeoPoint() {
        return this.geoPoint;
    }

    public void setGeoPoint(GeoPointDTO geoPoint) {
        this.geoPoint = geoPoint;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIotliteInterfaceDescription() {
        return this.iotliteInterfaceDescription;
    }

    public void setIotliteInterfaceDescription(String iotliteInterfaceDescription) {
        this.iotliteInterfaceDescription = iotliteInterfaceDescription;
    }

    public List<IotLiteAttributeDTO> getIotLiteAttributeDTO() {
        return this.iotLiteAttributeDTO;
    }

    public void setIotLiteAttributeDTO(List<IotLiteAttributeDTO> iotLiteAttributeDTO) {
        this.iotLiteAttributeDTO = iotLiteAttributeDTO;
    }

}
