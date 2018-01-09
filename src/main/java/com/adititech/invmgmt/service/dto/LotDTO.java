package com.adititech.invmgmt.service.dto;

import java.io.Serializable;

/**
 * Created by kvishal on 08-01-2018.
 */
public class LotDTO implements Serializable{

    private long lotId;
    private String lotNo;
    private int pcs = 1;
    private double weight;
    private double rate;
    private double amount;
    private String lotRemarks;
    private String lotType;

    public long getLotId() {
        return lotId;
    }

    public void setLotId(long lotId) {
        this.lotId = lotId;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getLotRemarks() {
        return lotRemarks;
    }

    public void setLotRemarks(String lotRemarks) {
        this.lotRemarks = lotRemarks;
    }

    public String getLotType() {
        return lotType;
    }

    public void setLotType(String lotType) {
        this.lotType = lotType;
    }


    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }
}
