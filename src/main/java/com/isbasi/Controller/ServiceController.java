package com.isbasi.Controller;

import com.isbasi.model.BankAccount;
import com.isbasi.model.Service;
import com.isbasi.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @PostMapping // yeni servis oluşturmak için endpoint
    public Service createService(@RequestBody Service serviceRequest){
        return serviceService.create(serviceRequest);
    }

    @GetMapping //tüm servisleri görüntülemek için endpoint
    public List<Service> getAllService(){
        return serviceService.getAll();
    }

    @PutMapping //servis güncellemek için endpoint
    public Service updateService(@RequestBody Service serviceRequest){
        return serviceService.update(serviceRequest);
    }

    @DeleteMapping(value = "/{serviceCode}") //servis koduna göre servis silmek için endpoint
    public List<Service> deleteService(@PathVariable String serviceCode){
        return serviceService.delete(serviceCode);
    }
}
