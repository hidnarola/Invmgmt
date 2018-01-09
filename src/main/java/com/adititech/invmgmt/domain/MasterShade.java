package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_shade")
public class MasterShade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Shade_Id")
    private Long shadeId;

    @Column(name = "Shade_Name",length = 50)
    private String shadeName;

    @Column(name = "Shade_Description",length = 50)
    private String shadeDescription;

    @Column(name = "Sr_No")
    private Long srNo;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By",length = 50)
    private String modifiedBy;

    @Column(name = "Modified_MachineName",length = 50)
    private String modifiedMachineName;

    @Column(name = "active",nullable = false,length = 1)
    private byte active;

    @Column(name = "YearEnd_Id",nullable = false)
    private Long yearEndId;

    @Column(name = "Shade_Name_Native",length = 50)
    private String shadeNameNative;


    public Long getShadeId() {
        return shadeId;
    }

    public void setShadeId(Long shadeId) {
        this.shadeId = shadeId;
    }

    public String getShadeName() {
        return shadeName;
    }

    public void setShadeName(String shadeName) {
        this.shadeName = shadeName;
    }

    public String getShadeDescription() {
        return shadeDescription;
    }

    public void setShadeDescription(String shadeDescription) {
        this.shadeDescription = shadeDescription;
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

    public String getShadeNameNative() {
        return shadeNameNative;
    }

    public void setShadeNameNative(String shadeNameNative) {
        this.shadeNameNative = shadeNameNative;
    }
}
