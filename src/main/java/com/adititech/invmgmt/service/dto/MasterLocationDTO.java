package com.adititech.invmgmt.service.dto;

/**
 * Created by kvishal on 08-01-2018.
 */
public class MasterLocationDTO {
    private long locationId;
    private String locationName;


    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
