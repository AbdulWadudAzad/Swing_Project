/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.domain;

import java.util.Date;

/**
 *
 * @author user
 */
public class CycleSales {
    private int id;
    private String name;
    private String pCode;
    private int quantity;
    private double unitPrice;
    private double totlalPrice;
    private Date salesDate;
    private CyclePurchase cp;

    public CycleSales() {
    }

    public CycleSales(int id, String name, String pCode, int quantity, double unitPrice, double totlalPrice, Date salesDate, CyclePurchase cp) {
        this.id = id;
        this.name = name;
        this.pCode = pCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totlalPrice = totlalPrice;
        this.salesDate = salesDate;
        this.cp = cp;
    }

    public CycleSales(String name, String pCode, int quantity, double unitPrice, double totlalPrice, Date salesDate, CyclePurchase cp) {
        this.name = name;
        this.pCode = pCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totlalPrice = totlalPrice;
        this.salesDate = salesDate;
        this.cp = cp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotlalPrice() {
        return totlalPrice;
    }

    public void setTotlalPrice(double totlalPrice) {
        this.totlalPrice = totlalPrice;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public CyclePurchase getCp() {
        return cp;
    }

    public void setCp(CyclePurchase cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "CycleSales{" + "id=" + id + ", name=" + name + ", pCode=" + pCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totlalPrice=" + totlalPrice + ", salesDate=" + salesDate + ", cp=" + cp + '}';
    }

    
}
