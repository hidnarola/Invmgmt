package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "master_blackinclusion")
public class MasterBlackinclusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Blackinclusion_Id")
    private Long blackinclusionId;

    @Column(name = "Blackinclusion_Name", length = 50)
    private String blackinclusionName;

    @Column(name = "Blackinclusion_Description", length = 50)
    private String Blackinclusion_Description;

    @Column(name = "Sr_No")
    private Long srNo;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By", length = 50)
    private String modifiedBy;

    @Column(name = "Modified_MachineName", length = 50)
    private String modifiedMachineName;

    @Column(name = "active", length = 1, nullable = false)
    private byte active = 1;

    @Column(name = "YearEnd_Id", nullable = false)
    private Long yearEndId;

    @Column(name = "Blackinclusion_Name_Native")
    private String blackinclusionNameNative;


    public Long getBlackinclusionId() {
        return blackinclusionId;
    }

    public void setBlackinclusionId(Long blackinclusionId) {
        this.blackinclusionId = blackinclusionId;
    }

    public String getBlackinclusionName() {
        return blackinclusionName;
    }

    public void setBlackinclusionName(String blackinclusionName) {
        this.blackinclusionName = blackinclusionName;
    }

    public String getBlackinclusion_Description() {
        return Blackinclusion_Description;
    }

    public void setBlackinclusion_Description(String blackinclusion_Description) {
        Blackinclusion_Description = blackinclusion_Description;
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

    public Long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(Long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public String getBlackinclusionNameNative() {
        return blackinclusionNameNative;
    }

    public void setBlackinclusionNameNative(String blackinclusionNameNative) {
        this.blackinclusionNameNative = blackinclusionNameNative;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }
}
