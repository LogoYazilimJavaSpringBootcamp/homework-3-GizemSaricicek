package com.isbasi.model;

public class BankAccount {

    private String accountName;
    private long accountNo;
    private String iban;
    private String foreignCurrency; //döviz

    public BankAccount(String accountName, long accountNo, String iban, String foreignCurrency) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.iban = iban;
        this.foreignCurrency = foreignCurrency;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public void setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }
}
