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
    public BankAccount createBankAccount(BankAccount bankAccountRequest) {
        return bankAccountRepository.save(bankAccountRequest);
    }

    public List<BankAccount> getAllBankAccount() {
        return bankAccountRepository.findAll();
    }
}
