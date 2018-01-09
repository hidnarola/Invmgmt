package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_symmetry")
public class MasterSymmetry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Symmetry_Id")
    private Long symmetryId;

    @Column(name = "Symmetry_Name",length = 50)
    private String symmetryName;

    @Column(name = "Symmetry_Description",length = 50)
    private String symmetryDescription;

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

    @Column(name = "Symmetry_Name_Native",length = 50)
    private String symmetryNameNative;


    public Long getSymmetryId() {
        return symmetryId;
    }

    public void setSymmetryId(Long symmetryId) {
        this.symmetryId = symmetryId;
    }

    public String getSymmetryName() {
        return symmetryName;
    }

    public void setSymmetryName(String symmetryName) {
        this.symmetryName = symmetryName;
    }

    public String getSymmetryDescription() {
        return symmetryDescription;
    }

    public void setSymmetryDescription(String symmetryDescription) {
        this.symmetryDescription = symmetryDescription;
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

    public String getSymmetryNameNative() {
        return symmetryNameNative;
    }

    public void setSymmetryNameNative(String symmetryNameNative) {
        this.symmetryNameNative = symmetryNameNative;
    }
}
