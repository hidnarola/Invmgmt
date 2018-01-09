package com.adititech.invmgmt.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.checkerframework.common.value.qual.DoubleVal;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Created by kvishal on 09-01-2018.
 */
public class InvoiceDTO {

    private String invoiceNo;
    private String refInvoiceNo;
    private String to;
    private long saleGroup;
    private String invoiceDate;
    private String stockDate;
    private String dueDate;
    private String type;
    private String exportType;
    private long location;
    private long category;
    private double exchangeRate;
    private long dueDats;
    private long salesPerson;
    private List<LotDTO> lotList;
    private double subTotal;
    private double total;
    private String narration;
    private long noOflots;
    @JsonIgnore
    private String remoteAddress;


    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getRefInvoiceNo() {
        return refInvoiceNo;
    }

    public void setRefInvoiceNo(String refInvoiceNo) {
        this.refInvoiceNo = refInvoiceNo;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public long getSaleGroup() {
        return saleGroup;
    }

    public void setSaleGroup(long saleGroup) {
        this.saleGroup = saleGroup;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getStockDate() {
        return stockDate;
    }

    public void setStockDate(String stockDate) {
        this.stockDate = stockDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    public long getCategory() {
        return category;
    }

    public void setCategory(long category) {
        this.category = category;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public long getDueDats() {
        return dueDats;
    }

    public void setDueDats(long dueDats) {
        this.dueDats = dueDats;
    }

    public long getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(long salesPerson) {
        this.salesPerson = salesPerson;
    }

    public List<LotDTO> getLotList() {
        return lotList;
    }

    public void setLotList(List<LotDTO> lotList) {
        this.lotList = lotList;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public long getNoOflots() {
        return noOflots;
    }

    public void setNoOflots(long noOflots) {
        this.noOflots = noOflots;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
