package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_luster")
public class MasterLuster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Luster_Id")
    private Long lusterId;

    @Column(name = "Luster_Name",length = 50)
    private String lusterName;

    @Column(name = "Luster_Description",length = 50)
    private String lusterDescription;

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


    @Column(name = "Luster_Name_Native",length = 50)
    private String lusterNameNative;

    public Long getLusterId() {
        return lusterId;
    }

    public void setLusterId(Long lusterId) {
        this.lusterId = lusterId;
    }

    public String getLusterName() {
        return lusterName;
    }

    public void setLusterName(String lusterName) {
        this.lusterName = lusterName;
    }

    public String getLusterDescription() {
        return lusterDescription;
    }

    public void setLusterDescription(String lusterDescription) {
        this.lusterDescription = lusterDescription;
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

    public String getLusterNameNative() {
        return lusterNameNative;
    }

    public void setLusterNameNative(String lusterNameNative) {
        this.lusterNameNative = lusterNameNative;
    }
}
