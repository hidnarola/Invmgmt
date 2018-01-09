package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kvishal on 08-01-2018.
 */
@Entity
@Table(name = "receive_transaction")
public class ReceiveTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReceiveTransaction_Id")
    private long receiveTransactionId;

    @ManyToOne
    @JoinColumn(name = "Receive_Id")
    private Receive receive;

    @Column(name = "Lot_SrNo")
    private long lotSrNo ;

    @ManyToOne
    @JoinColumn(name = "Lot_Id")
    private Lot lot;

    @Column(name = "Quantity",columnDefinition = "decimal(19,4)")
    private double quantity =0.0000;

    @Column(name = "Available_Quantity",columnDefinition = "decimal(19,4)")
    private double availableQuantity =0.0000;

    @Column(name = "Receive_Price",columnDefinition = "decimal(19,4)")
    private double receivePrice =0.0000;

    @Column(name = "Local_Price",columnDefinition = "decimal(19,4)")
    private double localPrice =0.0000;

    @Column(name = "Dollar_Price",columnDefinition = "decimal(19,4)")
    private double dollarPrice =0.0000;

    @Column(name = "Pieces")
    private long pieces ;

    @Column(name = "Remarks",length = 50)
    private String remarks ;

    @Column(name = "Status")
    private short status= 3;

    @Column(name = "Return_Quantity",columnDefinition = "decimal(19,4)")
    private double returnQuantity =0.0000;

    @Column(name = "Return_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnOn;

    @Column(name = "Return_By",length = 50)
    private String returnBy;

    @Column(name = "Modified_On")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "Modified_By")
    private long modifiedBy;

    @Column(name = "Modified_MachineName",length = 50)
    private String modifiedMachineName ;

    @Column(name = "ProActive",nullable = false)
    private byte proActive =0;

    @Column(name = "Location_id")
    private long locationid =0;

    @Column(name = "Active",nullable = false)
    private byte active =1;

    @Column(name = "Consignment_ReceiveId")
    private long consignmentReceiveId =0;

    @Column(name = "Mov_WtdAvg",nullable = false)
    private byte movWtdAvg =0;

    @Column(name = "YearEnd_Id",nullable = false)
    private long yearEndId =0;

    @Column(name = "Ref_WHRTId")
     private long refWHRTId =0;

    @Column(name = "Ref_Status")
    private long refStatus=0;

    @Column(name = "Order_TransactionId")
    private long orderTransactionId =0;


    public long getReceiveTransactionId() {
        return receiveTransactionId;
    }

    public void setReceiveTransactionId(long receiveTransactionId) {
        this.receiveTransactionId = receiveTransactionId;
    }

    public Receive getReceive() {
        return receive;
    }

    public void setReceive(Receive receive) {
        this.receive = receive;
    }

    public long getLotSrNo() {
        return lotSrNo;
    }

    public void setLotSrNo(long lotSrNo) {
        this.lotSrNo = lotSrNo;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getReceivePrice() {
        return receivePrice;
    }

    public void setReceivePrice(double receivePrice) {
        this.receivePrice = receivePrice;
    }

    public double getLocalPrice() {
        return localPrice;
    }

    public void setLocalPrice(double localPrice) {
        this.localPrice = localPrice;
    }

    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public long getPieces() {
        return pieces;
    }

    public void setPieces(long pieces) {
        this.pieces = pieces;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public double getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(double returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public Date getReturnOn() {
        return returnOn;
    }

    public void setReturnOn(Date returnOn) {
        this.returnOn = returnOn;
    }

    public String getReturnBy() {
        return returnBy;
    }

    public void setReturnBy(String returnBy) {
        this.returnBy = returnBy;
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

    public byte getProActive() {
        return proActive;
    }

    public void setProActive(byte proActive) {
        this.proActive = proActive;
    }

    public long getLocationid() {
        return locationid;
    }

    public void setLocationid(long locationid) {
        this.locationid = locationid;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public long getConsignmentReceiveId() {
        return consignmentReceiveId;
    }

    public void setConsignmentReceiveId(long consignmentReceiveId) {
        this.consignmentReceiveId = consignmentReceiveId;
    }

    public byte getMovWtdAvg() {
        return movWtdAvg;
    }

    public void setMovWtdAvg(byte movWtdAvg) {
        this.movWtdAvg = movWtdAvg;
    }

    public long getYearEndId() {
        return yearEndId;
    }

    public void setYearEndId(long yearEndId) {
        this.yearEndId = yearEndId;
    }

    public long getRefWHRTId() {
        return refWHRTId;
    }

    public void setRefWHRTId(long refWHRTId) {
        this.refWHRTId = refWHRTId;
    }

    public long getRefStatus() {
        return refStatus;
    }

    public void setRefStatus(long refStatus) {
        this.refStatus = refStatus;
    }

    public long getOrderTransactionId() {
        return orderTransactionId;
    }

    public void setOrderTransactionId(long orderTransactionId) {
        this.orderTransactionId = orderTransactionId;
    }
}
