package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_polish")
public class MasterPolish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Polish_Id")
    private Long polishId;

    @Column(name = "Polish_Name",length = 50)
    private String polishName;

    @Column(name = "Polish_Description",length = 50)
    private String polishDescription;

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

    @Column(name = "Polish_Name_Native",length = 50)
    private String polishNameNative;


    public Long getPolishId() {
        return polishId;
    }

    public void setPolishId(Long polishId) {
        this.polishId = polishId;
    }

    public String getPolishName() {
        return polishName;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

    public String getPolishDescription() {
        return polishDescription;
    }

    public void setPolishDescription(String polishDescription) {
        this.polishDescription = polishDescription;
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

    public String getPolishNameNative() {
        return polishNameNative;
    }

    public void setPolishNameNative(String polishNameNative) {
        this.polishNameNative = polishNameNative;
    }
}
