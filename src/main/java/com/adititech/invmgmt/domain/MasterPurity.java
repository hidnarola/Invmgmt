package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_purity")
public class MasterPurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Purity_Id")
    private Long purityId;

    @Column(name = "Purity_Name",length = 50)
    private String purityName;

    @Column(name = "Purity_Description",length = 50)
    private String purityDescription;

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

    @Column(name = "Purity_Name_Native",length = 50)
    private String purityNameNative;


    public Long getPurityId() {
        return purityId;
    }

    public void setPurityId(Long purityId) {
        this.purityId = purityId;
    }

    public String getPurityName() {
        return purityName;
    }

    public void setPurityName(String purityName) {
        this.purityName = purityName;
    }

    public String getPurityDescription() {
        return purityDescription;
    }

    public void setPurityDescription(String purityDescription) {
        this.purityDescription = purityDescription;
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

    public String getPurityNameNative() {
        return purityNameNative;
    }

    public void setPurityNameNative(String purityNameNative) {
        this.purityNameNative = purityNameNative;
    }
}
