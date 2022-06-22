package com.isbasi.Controller;

import com.isbasi.model.Customer;
import com.isbasi.model.User;
import com.isbasi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomers(@RequestBody Customer requestCustomer){
        return customerService.createCustomer(requestCustomer);
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/{status}") //active ve passive customer listelemek için endpoin
    public Customer getCustomerByStatus(@PathVariable String status){
        return customerService.getByStatus(status);

    }
}
