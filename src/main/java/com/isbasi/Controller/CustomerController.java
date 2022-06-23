package com.isbasi.Controller;

import com.isbasi.model.BankAccount;
import com.isbasi.model.Customer;
import com.isbasi.model.User;
import com.isbasi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping //yeni bir customer oluşturmak için endpoint
    public Customer createCustomers(@RequestBody Customer requestCustomer){
        return customerService.createCustomer(requestCustomer);
    }

    @GetMapping //tüm customer'ları görüntülemek için endpoint
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/{status}") //active ve passive customer listelemek için endpoin
    public List<Customer> getCustomerByStatus(@PathVariable String status){
        return customerService.getByStatus(status);

    }
    @PutMapping //isme göre güncelleme yapmak için endpoint
    public Customer updateBankAccount(@RequestBody Customer customerRequest){
        return customerService.updateCustomer(customerRequest);
    }

    @DeleteMapping(value = "/{status}") //status'e göre silme işlemi yapmak için endpoint
    public List<Customer> deleteCustomer(@PathVariable String status){
        return customerService.deleteCustomer(status);
    }
}
