package com.isbasi.Repository;

import com.isbasi.model.Till;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TillRepository {

    List<Till> tillList = new ArrayList<>();

    public Till save(Till tillRequest) {
        tillList.add(tillRequest); //yeni kasa ekleniyor
        return tillRequest;
    }

    public List<Till> findAll() {
        return tillList;
    }

    public Till updateByName(Till tillRequest) {

        for(Till item: tillList) { // liste geziliyor.
            if(item.getTillName() == tillRequest.getTillName()){ // ismi uyan varsa
                item.setOpeningBalance(tillRequest.getOpeningBalance()); //update işlemleri yapılıyor.
                item.setForeignCurrency(tillRequest.getForeignCurrency());
                item.setOpenDate(tillRequest.getOpenDate());
            }
        }
        return tillRequest;
    }

    public List<Till> deleteByName(String name) { //hata var

        for(Till item: tillList) { // liste geziliyor.
            if(name.equals(item.getTillName())){ // name uyan varsa
                tillList.remove(item); //list'ten siliniyor.
            }
        }
        return tillList; //silinmiş hali ile kasa listesi dönüyor.
    }
}
