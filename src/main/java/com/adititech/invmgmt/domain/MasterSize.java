package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_size")
public class MasterSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Size_Id")
    private Long sizeId;

    @Column(name = "Size_Name",length = 50)
    private String sizeName;

    @Column(name = "Size_Description",length = 50)
    private String sizeDescription;

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

    @Column(name = "Size_Name_Native",length = 50)
    private String sizeNameNative;


    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
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

    public String getSizeNameNative() {
        return sizeNameNative;
    }

    public void setSizeNameNative(String sizeNameNative) {
        this.sizeNameNative = sizeNameNative;
    }
}
