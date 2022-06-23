package com.isbasi.service;

import com.isbasi.Repository.ServiceRepository;
import com.isbasi.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    ServiceRepository serviceRepository;
    public Service create(Service serviceRequest) {
        return serviceRepository.save(serviceRequest);
    } //servis yaratma

    public List<Service> getAll() { //servis görüntüleme
        return serviceRepository.findAll();
    }

    public Service update(Service serviceRequest) { //servis güncelleme
        return serviceRepository.updateByCode(serviceRequest);
    }

    public List<Service> delete(String serviceCode) {
        return serviceRepository.deleteByCode(serviceCode);
    } //servis silme
}
