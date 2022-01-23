package com.SPMProject.backend.dto;

import com.SPMProject.backend.entityModel.iotliteCircle;

public class IotLiteCoverageDTO {
    private long id;
    private String iotliteRectangle;
    private String iotlitePolygon;
    private iotliteCircle iotliteCircle;
    private GeoPointDTO geoPoint;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIotliteRectangle() {
        return this.iotliteRectangle;
    }

    public void setIotliteRectangle(String iotliteRectangle) {
        this.iotliteRectangle = iotliteRectangle;
    }

    public String getIotlitePolygon() {
        return this.iotlitePolygon;
    }

    public void setIotlitePolygon(String iotlitePolygon) {
        this.iotlitePolygon = iotlitePolygon;
    }

    public iotliteCircle getIotliteCircle() {
        return this.iotliteCircle;
    }

    public void setIotliteCircle(iotliteCircle iotliteCircle) {
        this.iotliteCircle = iotliteCircle;
    }

    public GeoPointDTO getGeoPoint() {
        return this.geoPoint;
    }

    public void setGeoPoint(GeoPointDTO geoPoint) {
        this.geoPoint = geoPoint;
    }

}
