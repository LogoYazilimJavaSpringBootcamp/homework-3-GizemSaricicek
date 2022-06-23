package com.isbasi.Controller;

import com.isbasi.model.Till;
import com.isbasi.service.TillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/tills")
public class TillController {

    @Autowired
    TillService tillService;

    @PostMapping
    public Till createTill(@RequestBody Till tillRequest){
        return tillService.create(tillRequest);
    }

    @GetMapping
    public List<Till> getAllTill(){
        return tillService.getAllTill();
    }

    @PutMapping
    public Till updateTill(@RequestBody Till tillRequest){
        return tillService.update(tillRequest);
    }

    @DeleteMapping(value = "/{tillName}")
    public List<Till> deleteTill(@PathVariable String tillName){
        return tillService.delete(tillName);
    }
}
