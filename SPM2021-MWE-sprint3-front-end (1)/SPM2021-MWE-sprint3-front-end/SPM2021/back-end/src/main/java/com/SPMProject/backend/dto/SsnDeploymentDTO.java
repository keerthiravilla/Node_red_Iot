package com.SPMProject.backend.dto;

public class SsnDeploymentDTO {
    private long id;
    private String description;
    private GeoPointDTO geoPoint;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeoPointDTO getGeoPoint() {
        return this.geoPoint;
    }

    public void setGeoPoint(GeoPointDTO geoPoint) {
        this.geoPoint = geoPoint;
    }

}
