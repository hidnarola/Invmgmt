package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 08-01-2018.
 */
@Entity
@Table(name = "recieve")
public class Receive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Receive_Id")
    private long receiveId;

    @Column(name = "Receive_Sell", nullable = false)
    private boolean receiveSell = true;

    @Column(name = "Receive_No", length = 50)
    private String receiveNo;

    @Column(name = "Receive_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiveDate;

    @Column(name = "Receive_Lots")
    private long receiveLots = 0;

    @Column(name = "Receive_Quantity",columnDefinition = "decimal(19,4)")
    private double receiveQuantity =0.0000;

    @Column(name = "Receive_CurrencyId")
    private long receiveCurrencyId =0;

    @Column(name = "Exchange_Rate",columnDefinition = "decimal(19,4)")
    private double exchangeRate = 0.0000;

    @Column(name = "Receive_ExchangeRate",columnDefinition = "decimal(19,4)")
    private double receiveExchangeRate =0.0000;

    @Column(name = "Tax",columnDefinition = "decimal(19,4)")
    private double tax =0.0000;

    @Column(name = "Discount")
    private long discount = 0;

    @Column(name = "Receive_Total",columnDefinition = "decimal(19,4)")
    private double receiveTotal =0.0000;

    @Column(name = "Local_Total",columnDefinition = "decimal(19,4)")
    private double localTotal = 0.0000;

    @Column(name = "Dollar_Total",columnDefinition = "decimal(19,4)")
    private double dollarTotal = 0.0000;

    @Column(name = "Receive_FromId")
    private long receiveFromId = 0;

    @Column(name = "Receive_FromName", length = 50)
    private String receiveFromName;

    @ManyToOne
    @JoinColumn(name = "Company_Id")
    private MasterCompanyParty masterCompanyParty;

    @Column(name = "Receive_ByName",length = 50)
    private String receiveByName ;

    @Column(name = "Receive_Internal",nullable = false)
    private boolean receiveInternal = false;

    @Column(name = "Purchase",nullable = false)
    private boolean purchase ;

    @Column(name = "Due_Days",length = 1,nullable = false)
    private long dueDays=0;

    @Column(name = "Due_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;

    @Column(name = "Challan_No",length = 50)
    private String challanNo;

    @Column(name = "Challan_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date challanDate;


    @Column(name = "Invoice_No",length = 50)
    private String invoiceNo;

    @Column(name = "Invoice_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;

    @Column(name = "Remarks",length = 100)
    private String remarks ;

    @Column(name = "Opening_Stock",nullable = false)
    private boolean openingStock=false;

    @Column(name = "SalesPerson_Id")
    private long salesPersonId =0;

    @Column(name = "Consignment_ReceiveId")
    private long consignmentReceiveId =0;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By")
    private long modifiedBy =0;

    @Column(name = "Modified_MachineName",length = 50)
    private String modifiedMachineName;

    @Column(name = "Active",nullable = false)
    private boolean active =true;

    @Column(name = "ProActive",nullable = false)
    private boolean proActive =false;

    @Column(name = "R_Return",nullable = false)
    private boolean rReturn =false;

    @Column(name = "Stock_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stockDate;

    @Column(name = "Difference_Amount",columnDefinition = "decimal(19,4)")
    private double differenceAmount =0.0000;

    @Column(name = "Difference_LocalAmount",columnDefinition = "decimal(19,4)")
    private double differenceLocalAmount =0.0000;

    @Column(name = "Difference_DollarAmount",columnDefinition = "decimal(19,4)")
    private double differenceDollarAmount = 0.0000;

    @Column(name = "InvTotal",columnDefinition = "decimal(19,4)")
    private double invTotal =0.0000;

    @Column(name = "InvLocalTotal",columnDefinition = "decimal(19,4)")
    private double invLocalTotal =0.0000;

    @Column(name = "InvDollarTotal",columnDefinition = "decimal(19,4)")
    private double invDollarTotal =0.0000;

    @Column(name = "Receive_Category")
    private long receiveCategory = 0;

    @Column(name = "StockTransfer_Type")
    private short stockTransferType =0;

    @Column(name = "Cgt_ReturnConfirm")
    private long cgtReturnConfirm =0;

    @Column(name = "YearEnd_Id")
    private long yearEndId =0;

    @Column(name = "PurchaseSaleGroup_Id")
    private long purchaseSaleGroupId =0;

    @Column(name = "CgtRef_No",length = 50)
    private String cgtRefNo;

    @Column(name = "CgtDescription",length = 1000)
    private String cgtDescription ;

    @Column(name = "WorkOrder_Id")
    private long workOrderId;

    public long getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(long receiveId) {
        this.receiveId = receiveId;
    }

    public String getReceiveNo() {
        return receiveNo;
    }

    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }


    public double getReceiveQuantity() {
        return receiveQuantity;
    }

    public void setReceiveQuantity(double receiveQuantity) {
        this.receiveQuantity = receiveQuantity;
    }


    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getReceiveExchangeRate() {
        return receiveExchangeRate;
    }

    public void setReceiveExchangeRate(double receiveExchangeRate) {
        this.receiveExchangeRate = receiveExchangeRate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public double getReceiveTotal() {
        return receiveTotal;
    }

    public void setReceiveTotal(double receiveTotal) {
        this.receiveTotal = receiveTotal;
    }

    public double getLocalTotal() {
        return localTotal;
    }

    public void setLocalTotal(double localTotal) {
        this.localTotal = localTotal;
    }

    public double getDollarTotal() {
        return dollarTotal;
    }

    public void setDollarTotal(double dollarTotal) {
        this.dollarTotal = dollarTotal;
    }

    public long getReceiveFromId() {
        return receiveFromId;
    }

    public void setReceiveFromId(long receiveFromId) {
        this.receiveFromId = receiveFromId;
    }

    public String getReceiveFromName() {
        return receiveFromName;
    }

    public void setReceiveFromName(String receiveFromName) {
        this.receiveFromName = receiveFromName;
    }

    public MasterCompanyParty getMasterCompanyParty() {
        return masterCompanyParty;
    }

    public void setMasterCompanyParty(MasterCompanyParty masterCompanyParty) {
        this.masterCompanyParty = masterCompanyParty;
    }

    public String getReceiveByName() {
        return receiveByName;
    }

    public void setReceiveByName(String receiveByName) {
        this.receiveByName = receiveByName;
    }

    public long getDueDays() {
        return dueDays;
    }

    public void setDueDays(long dueDays) {
        this.dueDays = dueDays;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getChallanNo() {
        return challanNo;
    }

    public void setChallanNo(String challanNo) {
        this.challanNo = challanNo;
    }

    public Date getChallanDate() {
        return challanDate;
    }

    public void setChallanDate(Date challanDate) {
        this.challanDate = challanDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public long getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(long salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public long getConsignmentReceiveId() {
        return consignmentReceiveId;
    }

    public void setConsignmentReceiveId(long consignmentReceiveId) {
        this.consignmentReceiveId = consignmentReceiveId;
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


    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }

    public double getDifferenceAmount() {
        return differenceAmount;
    }

    public void setDifferenceAmount(double differenceAmount) {
        this.differenceAmount = differenceAmount;
    }

    public double getDifferenceLocalAmount() {
        return differenceLocalAmount;
    }

    public void setDifferenceLocalAmount(double differenceLocalAmount) {
        this.differenceLocalAmount = differenceLocalAmount;
    }

    public double getDifferenceDollarAmount() {
        return differenceDollarAmount;
    }

    public void setDifferenceDollarAmount(double differenceDollarAmount) {
        this.differenceDollarAmount = differenceDollarAmount;
    }

    public double getInvTotal() {
        return invTotal;
    }

    public void setInvTotal(double invTotal) {
        this.invTotal = invTotal;
    }

    public double getInvLocalTotal() {
        return invLocalTotal;
    }

    public void setInvLocalTotal(double invLocalTotal) {
        this.invLocalTotal = invLocalTotal;
    }

    public double getInvDollarTotal() {
        return invDollarTotal;
    }

    public void setInvDollarTotal(double invDollarTotal) {
        this.invDollarTotal = invDollarTotal;
    }

    public long getReceiveCategory() {
        return receiveCategory;
    }

    public void setReceiveCategory(long receiveCategory) {
        this.receiveCategory = receiveCategory;
    }

    public short getStockTransferType() {
        return stockTransferType;
    }

    public void setStockTransferType(short stockTransferType) {
        this.stockTransferType = stockTransferType;
    }

    public long getCgtReturnConfirm() {
        return cgtReturnConfirm;
    }

    public void setCgtReturnConfirm(long cgtReturnConfirm) {
        this.cgtReturnConfirm = cgtReturnConfirm;
    }

    public long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public long getPurchaseSaleGroupId() {
        return purchaseSaleGroupId;
    }

    public void setPurchaseSaleGroupId(long purchaseSaleGroupId) {
        this.purchaseSaleGroupId = purchaseSaleGroupId;
    }

    public String getCgtRefNo() {
        return cgtRefNo;
    }

    public void setCgtRefNo(String cgtRefNo) {
        this.cgtRefNo = cgtRefNo;
    }

    public String getCgtDescription() {
        return cgtDescription;
    }

    public void setCgtDescription(String cgtDescription) {
        this.cgtDescription = cgtDescription;
    }

    public long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(long workOrderId) {
        this.workOrderId = workOrderId;
    }


    public boolean isReceiveSell() {
        return receiveSell;
    }

    public void setReceiveSell(boolean receiveSell) {
        this.receiveSell = receiveSell;
    }

    public long getReceiveLots() {
        return receiveLots;
    }

    public void setReceiveLots(long receiveLots) {
        this.receiveLots = receiveLots;
    }

    public long getReceiveCurrencyId() {
        return receiveCurrencyId;
    }

    public void setReceiveCurrencyId(long receiveCurrencyId) {
        this.receiveCurrencyId = receiveCurrencyId;
    }

    public boolean isReceiveInternal() {
        return receiveInternal;
    }

    public void setReceiveInternal(boolean receiveInternal) {
        this.receiveInternal = receiveInternal;
    }

    public boolean isPurchase() {
        return purchase;
    }

    public void setPurchase(boolean purchase) {
        this.purchase = purchase;
    }

    public boolean isOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(boolean openingStock) {
        this.openingStock = openingStock;
    }

    public boolean isrReturn() {
        return rReturn;
    }

    public void setrReturn(boolean rReturn) {
        this.rReturn = rReturn;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isProActive() {
        return proActive;
    }

    public void setProActive(boolean proActive) {
        this.proActive = proActive;
    }
}
