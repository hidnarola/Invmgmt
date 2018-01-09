package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_openinclusion")
public class MasterOpeninclusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Openinclusion_Id")
    private Long openinclusionId;

    @Column(name = "Openinclusion_Name", length = 50)
    private String openinclusionName;

    @Column(name = "Openinclusion_Description", length = 50)
    private String openinclusionDescription;

    @Column(name = "Sr_No")
    private Long srNo;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By", length = 50)
    private String modifiedBy;

    @Column(name = "Modified_MachineName", length = 50)
    private String modifiedMachineName;

    @Column(name = "active", nullable = false, length = 1)
    private byte active = 1;

    @Column(name = "YearEnd_Id", nullable = false)
    private Long yearEndId;

    @Column(name = "Openinclusion_Name_Native", length = 50)
    private String openinclusionNameNative;


    public Long getOpeninclusionId() {
        return openinclusionId;
    }

    public void setOpeninclusionId(Long openinclusionId) {
        this.openinclusionId = openinclusionId;
    }

    public String getOpeninclusionName() {
        return openinclusionName;
    }

    public void setOpeninclusionName(String openinclusionName) {
        this.openinclusionName = openinclusionName;
    }

    public String getOpeninclusionDescription() {
        return openinclusionDescription;
    }

    public void setOpeninclusionDescription(String openinclusionDescription) {
        this.openinclusionDescription = openinclusionDescription;
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

    public String getOpeninclusionNameNative() {
        return openinclusionNameNative;
    }

    public void setOpeninclusionNameNative(String openinclusionNameNative) {
        this.openinclusionNameNative = openinclusionNameNative;
    }
}
