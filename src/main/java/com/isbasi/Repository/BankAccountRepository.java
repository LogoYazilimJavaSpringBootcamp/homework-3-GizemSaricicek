package com.isbasi.Repository;

import com.isbasi.model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {

    List<BankAccount> bankAccountList = new ArrayList<>(); //oluşan banka hesaplarını tutmak için bir list
    public BankAccount save(BankAccount bankAccountRequest) { //banka hesabı oluşturmak için metod
        bankAccountList.add(bankAccountRequest);
        return bankAccountRequest;
    }

    public List<BankAccount> findAll() {
        return bankAccountList;
    }
}
