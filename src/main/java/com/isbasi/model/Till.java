package com.isbasi.model;

import java.time.LocalDateTime;

//Kasa class'ı
public class Till {

    private String tillName;
    private String foreignCurrency;
    private LocalDateTime openDate;
    private Double openingBalance; // açılış bakiyesi

    public Till(String tillName, String foreignCurrency, LocalDateTime openDate, Double openingBalance) {
        this.tillName = tillName;
        this.foreignCurrency = foreignCurrency;
        this.openDate = openDate;
        this.openingBalance = openingBalance;
    }

    public String getTillName() {
        return tillName;
    }

    public void setTillName(String tillName) {
        this.tillName = tillName;
    }

    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public void setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDateTime openDate) {
        this.openDate = openDate;
    }

    public Double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }
}
