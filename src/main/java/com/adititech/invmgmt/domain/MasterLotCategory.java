package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 04-01-2018.
 */
@Entity
@Table(name = "master_lotcategory")
public class MasterLotCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LotCategory_Id")
    private Long lotCategoryId;

    @ManyToOne
    @JoinColumn(name = "Company_id")
    private MasterCompanyParty masterCompanyParty;

    @Column(name = "LotCategory_Code", length = 25)
    private String lotCategoryCode;

    @Column(name = "LotCategory_Name", length = 50)
    private String lotCategoryName;

    @Column(name = "LotCategory_Description", length = 50)
    private String lotCategoryDescription;

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
    private boolean active = true;

    @Column(name = "YearEnd_Id")
    private Long yearEndId = 0L;

    @Column(name = "LotCategory_Name_Native",length = 50)
    private String lotCategoryNameNative;


    public Long getLotCategoryId() {
        return lotCategoryId;
    }

    public void setLotCategoryId(Long lotCategoryId) {
        this.lotCategoryId = lotCategoryId;
    }

    public String getLotCategoryCode() {
        return lotCategoryCode;
    }

    public void setLotCategoryCode(String lotCategoryCode) {
        this.lotCategoryCode = lotCategoryCode;
    }

    public String getLotCategoryName() {
        return lotCategoryName;
    }

    public void setLotCategoryName(String lotCategoryName) {
        this.lotCategoryName = lotCategoryName;
    }

    public String getLotCategoryDescription() {
        return lotCategoryDescription;
    }

    public void setLotCategoryDescription(String lotCategoryDescription) {
        this.lotCategoryDescription = lotCategoryDescription;
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

    public String getLotCategoryNameNative() {
        return lotCategoryNameNative;
    }

    public void setLotCategoryNameNative(String lotCategoryNameNative) {
        this.lotCategoryNameNative = lotCategoryNameNative;
    }


    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
