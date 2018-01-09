package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 04-01-2018.
 */
@Entity
@Table(name = "master_unit")
public class MasterUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Unit_Id;

    @ManyToOne
    @JoinColumn(name = "Company_Id")
    private MasterCompanyParty masterCompanyParty;

    @Column(name = "Unit_Name",length = 10)
    private String unitName;

    @Column(name = "Unit_Code",length = 50)
    private String Unit_Code;

    @Column(name = "Unit_Description",length = 50)
    private String Unit_Description;

    @Column(name = "Modified_By", length = 50)
    private String Modified_By;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_MachineName", length = 50)
    private String modifiedMachineName;

    @Column(name = "Sr_No")
    private Long srNo;

    @Column(name = "Active",nullable = false)
    private byte active = 1;

    @Column(name = "YearEnd_Id")
    private Long yearEndId = 0L;

    @Column(name = "Unit_Name_Native",length = 50)
    private String unitNameNative;


    public Long getUnit_Id() {
        return Unit_Id;
    }

    public void setUnit_Id(Long unit_Id) {
        Unit_Id = unit_Id;
    }

    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnit_Code() {
        return Unit_Code;
    }

    public void setUnit_Code(String unit_Code) {
        Unit_Code = unit_Code;
    }

    public String getUnit_Description() {
        return Unit_Description;
    }

    public void setUnit_Description(String unit_Description) {
        Unit_Description = unit_Description;
    }

    public String getModified_By() {
        return Modified_By;
    }

    public void setModified_By(String modified_By) {
        Modified_By = modified_By;
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

    public Long getSrNo() {
        return srNo;
    }

    public void setSrNo(Long srNo) {
        this.srNo = srNo;
    }


    public Long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(Long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public String getUnitNameNative() {
        return unitNameNative;
    }

    public void setUnitNameNative(String unitNameNative) {
        this.unitNameNative = unitNameNative;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }
}
