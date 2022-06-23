package com.isbasi.Repository;

import com.isbasi.model.Service;
import com.isbasi.model.Till;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TillRepository {

    List<Till> tillList = new ArrayList<>();

    public Till save(Till tillRequest) {
        tillList.add(tillRequest);
        return tillRequest;
    }

    public List<Till> findAll() {
        return tillList;
    }

    public Till updateByName(Till tillRequest) {

        for(Till item: tillList) { // liste geziliyor.
            if(item.getTillName() == tillRequest.getTillName()){ // hesap numarası uyan varsa
                item.setOpeningBalance(tillRequest.getOpeningBalance()); //update işlemleri yapılıyor.
                item.setForeignCurrency(tillRequest.getForeignCurrency());
                item.setOpenDate(tillRequest.getOpenDate());
            }
        }
        return tillRequest;
    }

    public List<Till> deleteByOpenDate(LocalDateTime openDate) {

        for(Till item: tillList) { // liste geziliyor.
            //if(item.getOpenDate() == openDate){ // open date uyan varsa
              //  tillList.remove(item); //list'ten siliniyor.
            //}
        }
        return tillList; //silinmiş hali ile kasa listesi dönüyor.
    }
}
