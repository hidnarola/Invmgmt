package com.adititech.invmgmt.service.dto;

/**
 * Created by kvishal on 09-01-2018.
 */
public class SalesPersonDTO {

    private long salesPersonId;
    private String salesPersonName;


    public long getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(long salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }
}
