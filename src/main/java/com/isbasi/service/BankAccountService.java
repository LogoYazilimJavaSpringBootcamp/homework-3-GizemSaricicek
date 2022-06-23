package com.isbasi.service;

import com.isbasi.Repository.BankAccountRepository;
import com.isbasi.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;
    public BankAccount createBankAccount(BankAccount bankAccountRequest) { //banka hesabı yaratma
        return bankAccountRepository.save(bankAccountRequest);
    }

    public List<BankAccount> getAllBankAccount() { //banka hesaplarını görüntüleme
        return bankAccountRepository.findAll();
    } //banka hesabı gösterme

    public BankAccount updateBankAccount(BankAccount bankAccountRequest) { //banka hesaplarını gğncelleme
        return bankAccountRepository.update(bankAccountRequest);
    }

    public List<BankAccount> deleteBankAccount(long accountNo){ //banka hesabı silme
        return bankAccountRepository.delete(accountNo);
    }
}
