package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 04-01-2018.
 */

@Entity
@Table(name = "master_lotsubcategory")
public class MasterLotSubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LotSubCategory_Id")
    private Long lotSubCategoryId;

    @ManyToOne
    @JoinColumn(name = "Company_Id")
    private MasterCompanyParty masterCompanyParty;

    @ManyToOne
    @JoinColumn(name = "LotCategory_Id")
    private MasterLotCategory masterLotCategory;

    @Column(name = "LotSubCategory_Code",length = 25)
    private String lotSubCategoryCode;

    @Column(name = "LotSubCategory_Name",length = 50)
    private  String lotSubCategoryName;

    @Column(name = "LotSubCategory_Description",length = 50)
    private String lotSubCategoryDescription;

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

    @Column(name = "LotCategory_Name_Native",length = 50)
    private String lotCategoryNameNative;


    public Long getLotSubCategoryId() {
        return lotSubCategoryId;
    }

    public void setLotSubCategoryId(Long lotSubCategoryId) {
        this.lotSubCategoryId = lotSubCategoryId;
    }

    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public MasterLotCategory getMasterLotCategory() {
        return masterLotCategory;
    }

    public void setMasterLotCategory(MasterLotCategory masterLotCategory) {
        this.masterLotCategory = masterLotCategory;
    }

    public String getLotSubCategoryCode() {
        return lotSubCategoryCode;
    }

    public void setLotSubCategoryCode(String lotSubCategoryCode) {
        this.lotSubCategoryCode = lotSubCategoryCode;
    }

    public String getLotSubCategoryName() {
        return lotSubCategoryName;
    }

    public void setLotSubCategoryName(String lotSubCategoryName) {
        this.lotSubCategoryName = lotSubCategoryName;
    }

    public String getLotSubCategoryDescription() {
        return lotSubCategoryDescription;
    }

    public void setLotSubCategoryDescription(String lotSubCategoryDescription) {
        this.lotSubCategoryDescription = lotSubCategoryDescription;
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

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }
}
