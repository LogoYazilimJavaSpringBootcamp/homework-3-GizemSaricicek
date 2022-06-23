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
    }

    public List<Till> getAllTill() {
        return tillRepository.findAll();
    }

    public Till update(Till tillRequest) {
        return tillRepository.updateByName(tillRequest);
    }

    public List<Till> delete(LocalDateTime openDate) {
        return tillRepository.deleteByOpenDate(openDate);
    }
}
