package com.isbasi.Controller;

import com.isbasi.model.BankAccount;
import com.isbasi.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping // banka hesaplarını görüntülemek için endpoint
    public List<BankAccount> getAllBankAccount(){
        return bankAccountService.getAllBankAccount();
    }

    @PutMapping //banka hesabını hesap numarasına göre güncellemek için endpoint
    public BankAccount updateBankAccount(@RequestBody BankAccount bankAccountRequest){
        return bankAccountService.updateBankAccount(bankAccountRequest);
    }

    @DeleteMapping(value = "/{accountNo}") //hesap numarasına göre banka hesabı silmek için endpoint
    public List<BankAccount> deleteBankAccount(@PathVariable long accountNo){
        return bankAccountService.deleteBankAccount(accountNo);
    }
}
