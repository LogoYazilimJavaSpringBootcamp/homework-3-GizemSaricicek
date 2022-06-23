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

    public List<BankAccount> findAll() { //tüm banka hesaplarını döndüren metod
        return bankAccountList;
    }

    public BankAccount update(BankAccount account) { //banka hesabında güncelleme yapan metod
        for(BankAccount item: bankAccountList) { // liste geziliyor.
            if(item.getAccountNo() == account.getAccountNo()){ // hesap numarası uyan varsa
                item.setAccountName(account.getAccountName()); //update işlemleri yapılıyor.
                item.setIban(account.getIban());
                item.setForeignCurrency(account.getForeignCurrency());
            }
        }
        return account;
    }

    public List<BankAccount> delete(long accountNo) { //hesap numarasına göre banka hesabı silen metod
        for(BankAccount item: bankAccountList) { //liste geziliyor.
            if(item.getAccountNo() == accountNo){ //eğer girilen hesap numarası varsa
                bankAccountList.remove(item); //list'ten çıkarılıyor.
            }
        }
        return bankAccountList; //silinmiş hali ile hesap listesi dönüyor.
    }
}
