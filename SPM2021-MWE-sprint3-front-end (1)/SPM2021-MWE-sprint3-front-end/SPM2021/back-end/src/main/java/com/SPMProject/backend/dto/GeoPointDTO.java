package com.SPMProject.backend.dto;

import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.ssnDeployment;

public class GeoPointDTO {
    private long id;
    private String iotliteRelativeLocation;
    private String iotliteAltRelative;
    private String alt;
    private String longg;
    private ssnDeployment ssnDeployment;
    private iotliteCoverage iotlitecoverage;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIotliteRelativeLocation() {
        return this.iotliteRelativeLocation;
    }

    public void setIotliteRelativeLocation(String iotliteRelativeLocation) {
        this.iotliteRelativeLocation = iotliteRelativeLocation;
    }

    public String getIotliteAltRelative() {
        return this.iotliteAltRelative;
    }

    public void setIotliteAltRelative(String iotliteAltRelative) {
        this.iotliteAltRelative = iotliteAltRelative;
    }

    public String getAlt() {
        return this.alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getLongg() {
        return this.longg;
    }

    public void setLongg(String longg) {
        this.longg = longg;
    }

    public ssnDeployment getSsnDeployment() {
        return this.ssnDeployment;
    }

    public void setSsnDeployment(ssnDeployment ssnDeployment) {
        this.ssnDeployment = ssnDeployment;
    }

    public iotliteCoverage getIotlitecoverage() {
        return this.iotlitecoverage;
    }

    public void setIotlitecoverage(iotliteCoverage iotlitecoverage) {
        this.iotlitecoverage = iotlitecoverage;
    }

}
