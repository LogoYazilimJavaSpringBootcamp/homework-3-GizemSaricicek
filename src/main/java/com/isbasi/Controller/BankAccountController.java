package com.isbasi.Controller;

import com.isbasi.model.BankAccount;
import com.isbasi.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bankAccounts")
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @PostMapping //yeni bir banka hesabı oluşturmak için endpoint
    public BankAccount createBankAccount(@RequestBody BankAccount bankAccountRequest){
       return bankAccountService.createBankAccount(bankAccountRequest);
    }

    @GetMapping
    public List<BankAccount> getAllBankAccount(){
        return bankAccountService.getAllBankAccount();
    }
}
