package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 04-01-2018.
 */
@Entity
@Table(name = "master_companyparty")
public class MasterCompanyParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CompanyParty_Id;

    @Column(name = "GroupCompany_Id")
    private Long groupCompanyId = 0L;

    @Column(name = "CompanyParty_Name", nullable = false, length = 50)
    private String companyPartyName;

    @Column(name = "Category_Code", length = 20)
    private String categoryCode;

    @Column(name = "Address1", length = 25)
    private String Address1;

    @Column(name = "Address2", length = 25)
    private String Address2;

    @Column(name = "Address3", length = 25)
    private String Address3;

    @Column(name = "City", length = 30)
    private String city;

    @Column(name = "Pin", length = 12)
    private String pin;

    @Column(name = "Country", length = 20)
    private String country;

    @Column(name = "Super", nullable = false, length = 1)
    private byte isSuper = 0;

    @Column(name = "Company", nullable = false, length = 1)
    private byte Company;

    @Column(name = "Company_Id")
    private Long ompanyId;

    @Column(name = "Income_TaxNo", length = 50)
    private String incomeTaxNo;

    @Column(name = "Sales_TaxNo", length = 50)
    private String salesTaxNo;

    @Column(name = "Phone_Off", length = 30)
    private String phoneOff;

    @Column(name = "Phone_Resi", length = 15)
    private String phoneResi;

    @Column(name = "Mobile", length = 15)
    private String mobile;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Website", length = 30)
    private String website;

    @Column(name = "Person1", length = 30)
    private String person1;

    @Column(name = "Person2", length = 30)
    private String person2;

    @Column(name = "Fax", length = 15)
    private String Fax;

    @Column(name = "Modified_By", length = 50)
    private String Modified_By;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_MachineName", length = 50)
    private String modifiedMachineName;

    @Column(name = "Active", nullable = false, length = 1)
    private byte active = 1;

    @Column(name = "Sr_No")
    private Long srNo = 0L;

    @Column(name = "Transaction_Currency", nullable = false)
    private short transactionCurrency = 1;

    @Column(name = "Opening_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openingDate;

    @Column(name = "Opening_RLocalBalance", columnDefinition = "decimal(19,4)")
    private double openingRLocalBalance = 0.0000;

    @Column(name = "Opening_RDollarBalance", columnDefinition = "decimal(19,4)")
    private double openingRDollarBalance = 0.0000;

    @Column(name = "Opening_RExchangeRate", columnDefinition = "decimal(19,4)")
    private double openingRExchangeRate = 0.0000;

    @Column(name = "Net_RLocalBalance", columnDefinition = "decimal(19,4)")
    private double netRLocalBalance = 0.0000;

    @Column(name = "Net_RDollarBalance", columnDefinition = "decimal(19,4)")
    private double netRDollarBalance = 0.0000;

    @Column(name = "RExchange_Rate", columnDefinition = "decimal(19,4)")
    private double rExchangeRate = 0.0000;

    @Column(name = "Opening_PLocalBalance", columnDefinition = "decimal(19,4)")
    private double openingPLocalBalance = 0.0000;

    @Column(name = "Opening_PDollarBalance", columnDefinition = "decimal(19,4)")
    private double openingPDollarBalance = 0.0000;

    @Column(name = "Opening_PExchangeRate", columnDefinition = "decimal(19,4)")
    private double openingPExchangeRate = 0.0000;

    @Column(name = "Net_PLocalBalance", columnDefinition = "decimal(19,4)")
    private double netPLocalBalance = 0.0000;

    @Column(name = "Net_PDollarBalance", columnDefinition = "decimal(19,4)")
    private double netPDollarBalance = 0.0000;

    @Column(name = "PExchange_Rate", columnDefinition = "decimal(19,4)")
    private double pExchangeRate = 0.0000;

    @Column(name = "Opening_PNLocalBalance", columnDefinition = "decimal(19,4)")
    private double openingPNLocalBalance = 0.0000;

    @Column(name = "Opening_PNDollarBalance", columnDefinition = "decimal(19,4)")
    private double openingPNDollarBalance = 0.0000;

    @Column(name = "Opening_PNExchangeRate", columnDefinition = "decimal(19,4)")
    private double openingPNExchangeRate = 0.0000;

    @Column(name = "Sale",length = 1,nullable = false)
    private byte sale = 0;

    @Column(name = "Purchase",length = 1,nullable = false)
    private byte purchase = 0;

    @Column(name = "PN",length = 1,nullable = false)
    private byte PIN = 0;

    @Column(name = "Purchase_AdvanceLocal", columnDefinition = "decimal(19,4)")
    private double purchaseAdvanceLocal = 0.0000;

    @Column(name = "Sale_AdvanceLocal", columnDefinition = "decimal(19,4)")
    private double saleAdvanceLocal = 0.0000;

    @Column(name = "PN_AdvanceLocal", columnDefinition = "decimal(19,4)")
    private double pnAdvanceLocal = 0.0000;

    @Column(name = "Purchase_AdvanceDollar")
    private Long purchaseAdvanceDollar = 0L;

    @Column(name = "Sale_AdvanceDollar", columnDefinition = "decimal(19,4)")
    private double saleAdvanceDollar = 0.0000;

    @Column(name = "PN_AdvanceDollar", columnDefinition = "decimal(19,4)")
    private double pnAdvanceDollar = 0.0000;

    @Column(name = "Payment_Date")
    private Long paymentDate = 0L;

    @Column(name = "Closing_Date")
    private Long closingDate = 0L;

    @Column(name = "Credit_Limit",columnDefinition = "decimal(19,4)")
    private double Credit_Limit = 0.0000;

    @Column(name = "Shikesho",length = 1,nullable = false)
    private byte Shikesho = 0;

    @Column(name = "Due_Days")
    private Long dueDays = 0L;

    @Column(name = "SalesPerson_Id")
    private Long salesPersonId = 0L;

    @Column(name = "YearEnd_Id",nullable = false)
    private Long yearEndId = 0L;

    @Column(name = "CompanyParty_Name_Native",length = 50)
    private String CompanyParty_Name_Native;

    @Column(name = "Address1_Native")
    private String address1Native;

    @Column(name = "Address2_Native")
    private String address2Native;

    @Column(name = "Address3_Native")
    private String address3Native;

    @Column(name = "City_Native",length = 50)
    private String City_Native;

    @Column(name = "Country_Native",length = 50)
    private String Country_Native;









}
