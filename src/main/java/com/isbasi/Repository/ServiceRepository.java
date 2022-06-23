package com.isbasi.Repository;

import com.isbasi.model.BankAccount;
import com.isbasi.model.Service;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ServiceRepository {

    public List<Service> serviceList = new ArrayList<>();
    public Service save(Service serviceRequest) {
        serviceList.add(serviceRequest);
        return serviceRequest;
    }

    public List<Service> findAll() {
        return serviceList;
    }

    public Service updateByCode(Service serviceRequest) {
        for(Service item: serviceList) { // liste geziliyor.
            if(item.getServiceCode() == serviceRequest.getServiceCode()){ // hesap numarası uyan varsa
                item.setServiceName(serviceRequest.getServiceName()); //update işlemleri yapılıyor.
                item.setPurchasePrice(serviceRequest.getPurchasePrice());
                item.setSalePrice(serviceRequest.getSalePrice());
                item.setQuantity(serviceRequest.getQuantity());
            }
        }
        return serviceRequest;
    }
    public List<Service> deleteByCode(String serviceCode) {

        for(Service item: serviceList) { // liste geziliyor.
            if(serviceCode.equals(item.getServiceCode())){ // servis kodu uyan varsa
                serviceList.remove(item); //list'ten siliniyor.
            }
        }
        return serviceList; //silinmiş hali ile hizmet listesi dönüyor.
    }
}
