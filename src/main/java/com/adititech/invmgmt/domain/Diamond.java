package com.adititech.invmgmt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kvishal on 05-01-2018.
 */
@Entity
@Table(name = "diamond")
public class Diamond extends Lot{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Cut_Id")
    private MasterCut masterCut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Color_Id")
    private MasterColor masterColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Purity_Id")
    private MasterPurity masterPurity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Fluorescence_Id")
    private  MasterFluorescence masterFluorescence;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Shape_Id")
    private MasterShape masterShape;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Lab_Id")
    private  MasterLab masterLab;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Polish_Id")
    private  MasterPolish masterPolish;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TableIncusion_Id")
    private MasterTableIncusion masterTableIncusion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Symmetry_Id")
    private MasterSymmetry masterSymmetry;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Luster_Id")
    private MasterLuster masterLuster;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Country_Id")
    private MasterCountry masterCountry;

    @Column(name = "Selling_Price",columnDefinition = "decimal(19,4)")
    private double SellingPrice = 0.0000;

    @Column(name = "Purchase_Price",columnDefinition = "decimal(19,4)")
    private double PurchasePrice = 0.0000;

    @Column(name = "Rapnet_Price",columnDefinition = "decimal(19,4)")
    private double RapnetPrice = 0.0000;

    @Column(name = "Rapnet_Date")
    private Date Rapnet_Date;

    @Column(name = "Total_Depth",columnDefinition = "decimal(19,4)")
    private double TotalDepth = 0.0000;

    @Column(name = "Table_Perecentage",columnDefinition = "decimal(19,4)")
    private double TablePerecentage = 0.0000;

    @Column(name = "Crown_Angle",columnDefinition = "decimal(19,4)")
    private double CrownAngle = 0.0000;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "D_Size")
    private MasterSize masterSize;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Shade_Id")
    private MasterShade masterShade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Openinclusion_Id")
    private MasterOpeninclusion masterOpeninclusion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Blackinclusion_Id")
    private MasterBlackinclusion masterBlackinclusion;

    @Column(name = "Weight",columnDefinition = "decimal(19,4)")
    private double weight = 0.0000;

    @Column(name = "YearEnd_Id",nullable = false)
    private long yearEndId = 0;

    @Column(name = "Diameter",columnDefinition = "decimal(19,4)")
    private double diameter = 0.0000;

    public MasterCut getMasterCut() {
        return masterCut;
    }

    public void setMasterCut(MasterCut masterCut) {
        this.masterCut = masterCut;
    }

    public MasterColor getMasterColor() {
        return masterColor;
    }

    public void setMasterColor(MasterColor masterColor) {
        this.masterColor = masterColor;
    }

    public MasterPurity getMasterPurity() {
        return masterPurity;
    }

    public void setMasterPurity(MasterPurity masterPurity) {
        this.masterPurity = masterPurity;
    }

    public MasterFluorescence getMasterFluorescence() {
        return masterFluorescence;
    }

    public void setMasterFluorescence(MasterFluorescence masterFluorescence) {
        this.masterFluorescence = masterFluorescence;
    }

    public MasterShape getMasterShape() {
        return masterShape;
    }

    public void setMasterShape(MasterShape masterShape) {
        this.masterShape = masterShape;
    }

    public MasterLab getMasterLab() {
        return masterLab;
    }

    public void setMasterLab(MasterLab masterLab) {
        this.masterLab = masterLab;
    }

    public MasterPolish getMasterPolish() {
        return masterPolish;
    }

    public void setMasterPolish(MasterPolish masterPolish) {
        this.masterPolish = masterPolish;
    }

    public MasterTableIncusion getMasterTableIncusion() {
        return masterTableIncusion;
    }

    public void setMasterTableIncusion(MasterTableIncusion masterTableIncusion) {
        this.masterTableIncusion = masterTableIncusion;
    }

    public MasterSymmetry getMasterSymmetry() {
        return masterSymmetry;
    }

    public void setMasterSymmetry(MasterSymmetry masterSymmetry) {
        this.masterSymmetry = masterSymmetry;
    }

    public MasterLuster getMasterLuster() {
        return masterLuster;
    }

    public void setMasterLuster(MasterLuster masterLuster) {
        this.masterLuster = masterLuster;
    }

    public MasterCountry getMasterCountry() {
        return masterCountry;
    }

    public void setMasterCountry(MasterCountry masterCountry) {
        this.masterCountry = masterCountry;
    }

    public double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public double getRapnetPrice() {
        return RapnetPrice;
    }

    public void setRapnetPrice(double rapnetPrice) {
        RapnetPrice = rapnetPrice;
    }

    public Date getRapnet_Date() {
        return Rapnet_Date;
    }

    public void setRapnet_Date(Date rapnet_Date) {
        Rapnet_Date = rapnet_Date;
    }

    public double getTotalDepth() {
        return TotalDepth;
    }

    public void setTotalDepth(double totalDepth) {
        TotalDepth = totalDepth;
    }

    public double getTablePerecentage() {
        return TablePerecentage;
    }

    public void setTablePerecentage(double tablePerecentage) {
        TablePerecentage = tablePerecentage;
    }

    public double getCrownAngle() {
        return CrownAngle;
    }

    public void setCrownAngle(double crownAngle) {
        CrownAngle = crownAngle;
    }

    public MasterSize getMasterSize() {
        return masterSize;
    }

    public void setMasterSize(MasterSize masterSize) {
        this.masterSize = masterSize;
    }

    public MasterShade getMasterShade() {
        return masterShade;
    }

    public void setMasterShade(MasterShade masterShade) {
        this.masterShade = masterShade;
    }

    public MasterOpeninclusion getMasterOpeninclusion() {
        return masterOpeninclusion;
    }

    public void setMasterOpeninclusion(MasterOpeninclusion masterOpeninclusion) {
        this.masterOpeninclusion = masterOpeninclusion;
    }

    public MasterBlackinclusion getMasterBlackinclusion() {
        return masterBlackinclusion;
    }

    public void setMasterBlackinclusion(MasterBlackinclusion masterBlackinclusion) {
        this.masterBlackinclusion = masterBlackinclusion;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    @Override
    public long getYearEndId() {
        return yearEndId;
    }

    @Override
    public void setYearEndId(long yearEndId) {
        this.yearEndId = yearEndId;
    }
}
