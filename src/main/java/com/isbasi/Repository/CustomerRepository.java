package com.isbasi.Repository;

import com.isbasi.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {

    private static List<Customer> customerList = new ArrayList<>();
    public Customer save(Customer request) {
        customerList.add(request);
        return request;
    }

    public List<Customer> findAll() {
        return customerList;
    }

    public Optional<Customer> findAllByStatus(String requestStatus) {
        return customerList.stream().filter(customer -> customer.getStatus().equals(requestStatus)).findFirst();
    }
}
