package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_fluorescence")
public class MasterFluorescence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Fluorescence_Id")
    private Long fluorescenceId;

    @Column(name = "Fluorescence_Name", length = 50)
    private String fluorescenceName;

    @Column(name = "Fluorescence_Description",length = 50)
    private String fluorescenceDescription;

    @Column(name = "Sr_No")
    private Long srNo;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By",length = 50)
    private String modifiedBy;

    @Column(name = "Modified_MachineName",length = 50)
    private String modifiedMachineName;

    @Column(name = "active",nullable = false)
    private byte active;

    @Column(name = "YearEnd_Id",nullable = false)
    private Long yearEndId;

    @Column(name = "Fluorescence_Name_Native",length = 50)
    private String fluorescenceNameNative;


    public Long getFluorescenceId() {
        return fluorescenceId;
    }

    public void setFluorescenceId(Long fluorescenceId) {
        this.fluorescenceId = fluorescenceId;
    }

    public String getFluorescenceName() {
        return fluorescenceName;
    }

    public void setFluorescenceName(String fluorescenceName) {
        this.fluorescenceName = fluorescenceName;
    }

    public String getFluorescenceDescription() {
        return fluorescenceDescription;
    }

    public void setFluorescenceDescription(String fluorescenceDescription) {
        this.fluorescenceDescription = fluorescenceDescription;
    }

    public Long getSrNo() {
        return srNo;
    }

    public void setSrNo(Long srNo) {
        this.srNo = srNo;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedMachineName() {
        return modifiedMachineName;
    }

    public void setModifiedMachineName(String modifiedMachineName) {
        this.modifiedMachineName = modifiedMachineName;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public Long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(Long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public String getFluorescenceNameNative() {
        return fluorescenceNameNative;
    }

    public void setFluorescenceNameNative(String fluorescenceNameNative) {
        this.fluorescenceNameNative = fluorescenceNameNative;
    }
}
