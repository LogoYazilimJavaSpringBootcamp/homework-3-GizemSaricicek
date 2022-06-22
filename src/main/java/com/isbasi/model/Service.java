package com.isbasi.model;

//hizmetler class'ı
public class Service {
    private String ServiceCode;
    private String name;
    private int quantity;
    private double salePrice;
    private double purchasePrice;

    public String getServiceCode() {
        return ServiceCode;
    }

    public Service(String serviceCode, String name, int quantity, double salePrice, double purchasePrice) {
        ServiceCode = serviceCode;
        this.name = name;
        this.quantity = quantity;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
    }

    public void setServiceCode(String serviceCode) {
        ServiceCode = serviceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
