package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_tableincusion")
public class MasterTableIncusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TableIncusion_Id")
    private Long tableIncusionId;

    @Column(name = "TableIncusion_Name",length = 50)
    private String tableIncusionName;

    @Column(name = "TableIncusion_Description",length = 50)
    private String tableIncusionDescription;

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

    @Column(name = "TableIncusion_Name_Native",length = 50)
    private String tableIncusionNameNative;


    public Long getTableIncusionId() {
        return tableIncusionId;
    }

    public void setTableIncusionId(Long tableIncusionId) {
        this.tableIncusionId = tableIncusionId;
    }

    public String getTableIncusionName() {
        return tableIncusionName;
    }

    public void setTableIncusionName(String tableIncusionName) {
        this.tableIncusionName = tableIncusionName;
    }

    public String getTableIncusionDescription() {
        return tableIncusionDescription;
    }

    public void setTableIncusionDescription(String tableIncusionDescription) {
        this.tableIncusionDescription = tableIncusionDescription;
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

    public String getTableIncusionNameNative() {
        return tableIncusionNameNative;
    }

    public void setTableIncusionNameNative(String tableIncusionNameNative) {
        this.tableIncusionNameNative = tableIncusionNameNative;
    }
}
