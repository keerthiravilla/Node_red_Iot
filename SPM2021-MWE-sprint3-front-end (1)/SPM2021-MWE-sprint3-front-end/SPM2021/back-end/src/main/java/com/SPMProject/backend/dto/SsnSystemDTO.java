package com.SPMProject.backend.dto;

public class SsnSystemDTO {
    private long id;
    private String ssnSubSystem;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSsnSubSystem() {
        return this.ssnSubSystem;
    }

    public void setSsnSubSystem(String ssnSubSystem) {
        this.ssnSubSystem = ssnSubSystem;
    }

}
