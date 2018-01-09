package com.adititech.invmgmt.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 08-01-2018.
 */
@Entity
@Table(name = "master_location")
public class MasterLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Location_Id")
    private long locationId ;

    @ManyToOne
    @JoinColumn(name = "Company_id")
    private MasterCompanyParty masterCompanyParty;

    @Column(name = "Location_Code",length = 25)
    private String locationCode ;


    @Column(name = "Location_Name",length = 50)
    private String locationName;

    @Column(name = "Location_Description")
    private String locationDescription;

    @Column(name = "Modified_By",length = 50)
    private String modifiedBy;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_MachineName",length = 50)
    private String modifiedMachineName;

    @Column(name = "Sr_No")
    private long srNo;

    @Column(name = "Active",nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean active=true;

    @Column(name = "YearEnd_Id",nullable = false)
    private long yearEndId=0;

    @Column(name = "Location_Name_Native",length = 50)
    private String locationNameNative;


    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedMachineName() {
        return modifiedMachineName;
    }

    public void setModifiedMachineName(String modifiedMachineName) {
        this.modifiedMachineName = modifiedMachineName;
    }

    public long getSrNo() {
        return srNo;
    }

    public void setSrNo(long srNo) {
        this.srNo = srNo;
    }

    public long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public String getLocationNameNative() {
        return locationNameNative;
    }

    public void setLocationNameNative(String locationNameNative) {
        this.locationNameNative = locationNameNative;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
