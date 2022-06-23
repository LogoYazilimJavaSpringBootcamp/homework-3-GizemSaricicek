package com.isbasi.model;

//hizmetler class'ı
public class Service {
    private String ServiceCode;
    private String serviceName;
    private int quantity;
    private Double salePrice;
    private Double purchasePrice;

    public Service(String serviceCode, String serviceName, int quantity, Double salePrice, Double purchasePrice) {
        this.ServiceCode = serviceCode;
        this.serviceName = serviceName;
        this.quantity = quantity;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
    }

    public String getServiceCode() {
        return ServiceCode;
    }
    public void setServiceCode(String serviceCode) {
        ServiceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
