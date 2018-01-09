package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

/**
 * Created by kvishal on 04-01-2018.
 */
@Entity
@Table(name = "lot")
@Inheritance(strategy = InheritanceType.JOINED)
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Lot_Id", nullable = false)
    private Long lotId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Company_Id")
    private MasterCompanyParty masterCompanyParty;

    @Column(name = "Lot_No", length = 50)
    private String lotNo;

    @Column(name = "Lot_Name", length = 50)
    private String lotName;

    @Column(name = "Lot_Description")
    private String lotDescription;

    @Column(name = "Lot_Referance", length = 50)
    private String lotReferance;

    @Column(name = "Lot_Location", length = 50)
    private String lotLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LotCategory_Id")
    private MasterLotCategory masterLotCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LotSubCategory_Id")
    private MasterLotSubCategory masterLotSubCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Unit_Id")
    private MasterUnit naMasterUnit;

    @Column(name = "Carats" ,columnDefinition = "decimal(19,4) default 0")
    private double carats;

    @Column(name = "Available_Carats",columnDefinition = "decimal(19,4) default 0")
    private double availableCarats;

    @Column(name = "ReorderQuantity",columnDefinition = "decimal(19,4) default 0")
    private double reorderQuantity;

    @Column(name = "Purchase",nullable = false)
    private int purchase =1 ;

    @Column(name = "Drwg_FileName")
    private String drwgFileName;

    @Column(name = "Created_On")
    private Instant createdOn = Instant.now();

    @Column(name = "Created_By")
    private long createdBy=2;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By")
    private Long modifiedBy;

    @Column(name = "Modified_MachineName")
    private String modifiedMachineName;

    @Column(name = "Active",nullable = false)
    private byte active = 1;

    @Column(name = "YearEnd_Id")
    private long yearEndId = 0;

    @Column(name = "RapaportLocal_Rate")
    private double rapaportLocalRate = 0.0000;

    @Column(name = "RapaportDollar_Rate")
    private double rapaportDollarRate = 0.0000;

    @Column(name = "GIA_Filename",length = 50)
    private String GIAFilename;

    @Column(name = "RefDesignGroup_Id")
    private Long refDesignGroup_Id;

    @Column(name = "DesignGroup_Id")
    private int designGroupId = 0;

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotDescription() {
        return lotDescription;
    }

    public void setLotDescription(String lotDescription) {
        this.lotDescription = lotDescription;
    }

    public String getLotReferance() {
        return lotReferance;
    }

    public void setLotReferance(String lotReferance) {
        this.lotReferance = lotReferance;
    }

    public String getLotLocation() {
        return lotLocation;
    }

    public void setLotLocation(String lotLocation) {
        this.lotLocation = lotLocation;
    }

    public MasterLotCategory getMasterLotCategory() {
        return masterLotCategory;
    }

    public void setMasterLotCategory(MasterLotCategory masterLotCategory) {
        this.masterLotCategory = masterLotCategory;
    }

    public MasterLotSubCategory getMasterLotSubCategory() {
        return masterLotSubCategory;
    }

    public void setMasterLotSubCategory(MasterLotSubCategory masterLotSubCategory) {
        this.masterLotSubCategory = masterLotSubCategory;
    }

    public MasterUnit getNaMasterUnit() {
        return naMasterUnit;
    }

    public void setNaMasterUnit(MasterUnit naMasterUnit) {
        this.naMasterUnit = naMasterUnit;
    }

    public double getCarats() {
        return carats;
    }

    public void setCarats(double carats) {
        this.carats = carats;
    }

    public double getAvailableCarats() {
        return availableCarats;
    }

    public void setAvailableCarats(double availableCarats) {
        this.availableCarats = availableCarats;
    }

    public double getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(double reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }

    public String getDrwgFileName() {
        return drwgFileName;
    }

    public void setDrwgFileName(String drwgFileName) {
        this.drwgFileName = drwgFileName;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedMachineName() {
        return modifiedMachineName;
    }

    public void setModifiedMachineName(String modifiedMachineName) {
        this.modifiedMachineName = modifiedMachineName;
    }

    public long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public double getRapaportLocalRate() {
        return rapaportLocalRate;
    }

    public void setRapaportLocalRate(double rapaportLocalRate) {
        this.rapaportLocalRate = rapaportLocalRate;
    }

    public double getRapaportDollarRate() {
        return rapaportDollarRate;
    }

    public void setRapaportDollarRate(double rapaportDollarRate) {
        this.rapaportDollarRate = rapaportDollarRate;
    }

    public String getGIAFilename() {
        return GIAFilename;
    }

    public void setGIAFilename(String GIAFilename) {
        this.GIAFilename = GIAFilename;
    }

    public Long getRefDesignGroup_Id() {
        return refDesignGroup_Id;
    }

    public void setRefDesignGroup_Id(Long refDesignGroup_Id) {
        this.refDesignGroup_Id = refDesignGroup_Id;
    }

    public int getDesignGroupId() {
        return designGroupId;
    }

    public void setDesignGroupId(int designGroupId) {
        this.designGroupId = designGroupId;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }


    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
