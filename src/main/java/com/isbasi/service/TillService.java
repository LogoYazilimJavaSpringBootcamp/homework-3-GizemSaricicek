package com.isbasi.service;

import com.isbasi.Repository.TillRepository;
import com.isbasi.model.Till;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TillService {

    @Autowired
    TillRepository tillRepository;
    public Till create(Till tillRequest) {
        return tillRepository.save(tillRequest);
    } //banka yaratma

    public List<Till> getAllTill() { //banka görüntüleme
        return tillRepository.findAll();
    }

    public Till update(Till tillRequest) {
        return tillRepository.updateByName(tillRequest);
    } //banka güncelleme

    public List<Till> delete(String name) {
        return tillRepository.deleteByName(name);
    } //kasa silme
}
