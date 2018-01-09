package com.adititech.invmgmt.service.dto;

/**
 * Created by kvishal on 09-01-2018.
 */
public class LotCategoryDTO {
    private Long lotCategoryId;
    private String lotCategoryName;

    public Long getLotCategoryId() {
        return lotCategoryId;
    }

    public void setLotCategoryId(Long lotCategoryId) {
        this.lotCategoryId = lotCategoryId;
    }

    public String getLotCategoryName() {
        return lotCategoryName;
    }

    public void setLotCategoryName(String lotCategoryName) {
        this.lotCategoryName = lotCategoryName;
    }
}
