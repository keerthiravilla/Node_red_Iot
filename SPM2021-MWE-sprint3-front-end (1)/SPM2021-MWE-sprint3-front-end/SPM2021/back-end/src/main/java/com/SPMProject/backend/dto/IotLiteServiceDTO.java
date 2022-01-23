package com.SPMProject.backend.dto;

public class IotLiteServiceDTO {
    private long id;
    private String iotliteInterfaceDescription;
    private String iotliteendpoint;
    private String iotliteexposedBy;
    private String iotliteinterfaceType;

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

    public String getIotliteendpoint() {
        return this.iotliteendpoint;
    }

    public void setIotliteendpoint(String iotliteendpoint) {
        this.iotliteendpoint = iotliteendpoint;
    }

    public String getIotliteexposedBy() {
        return this.iotliteexposedBy;
    }

    public void setIotliteexposedBy(String iotliteexposedBy) {
        this.iotliteexposedBy = iotliteexposedBy;
    }

    public String getIotliteinterfaceType() {
        return this.iotliteinterfaceType;
    }

    public void setIotliteinterfaceType(String iotliteinterfaceType) {
        this.iotliteinterfaceType = iotliteinterfaceType;
    }

}
