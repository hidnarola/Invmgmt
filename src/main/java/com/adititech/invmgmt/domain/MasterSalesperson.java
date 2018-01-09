package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 08-01-2018.
 */
@Entity
@Table(name = "master_salesperson")
public class MasterSalesperson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SalesPerson_Id")
    private long salesPersonId;

    @ManyToOne
    @JoinColumn(name = "Company_Id")
    private MasterCompanyParty masterCompanyParty;

    @Column(name = "SalesPerson_Name", length = 50)
    private String salesPersonName;

    @Column(name = "Address1", length = 50)
    private String address1;

    @Column(name = "Address2", length = 50)
    private String address2;

    @Column(name = "Address3", length = 50)
    private String address3;

    @Column(name = "City", length = 50)
    private String city;

    @Column(name = "Pin", length = 50)
    private String pin;

    @Column(name = "Country", length = 50)
    private String country;

    @Column(name = "Mobile", length = 50)
    private String mobile;

    @Column(name = "Phone_O", length = 50)
    private String phoneO;

    @Column(name = "Phone_R", length = 50)
    private String phoneR;

    @Column(name = "Fax", length = 50)
    private String fax;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By")
    private long modifiedBy = 0;

    @Column(name = "Modified_MachineName", length = 50)
    private String modifiedMachineName;

    @Column(name = "Active", nullable = false)
    private boolean active = true;

    @Column(name = "Sr_No")
    private long srNo;

    @Column(name = "YearEnd_Id")
    private long yearEndId;

    @Column(name = "Commission", columnDefinition = "decimal(19,4)")
    private double commission = 0.0000;

    @Column(name = "SalesPerson_Name_Native", length = 50)
    private String salesPersonNameNative;


    public long getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(long salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhoneO() {
        return phoneO;
    }

    public void setPhoneO(String phoneO) {
        this.phoneO = phoneO;
    }

    public String getPhoneR() {
        return phoneR;
    }

    public void setPhoneR(String phoneR) {
        this.phoneR = phoneR;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedMachineName() {
        return modifiedMachineName;
    }

    public void setModifiedMachineName(String modifiedMachineName) {
        this.modifiedMachineName = modifiedMachineName;
    }

    public long getSrNo() {
        return srNo;
    }

    public void setSrNo(long srNo) {
        this.srNo = srNo;
    }

    public long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getSalesPersonNameNative() {
        return salesPersonNameNative;
    }

    public void setSalesPersonNameNative(String salesPersonNameNative) {
        this.salesPersonNameNative = salesPersonNameNative;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
