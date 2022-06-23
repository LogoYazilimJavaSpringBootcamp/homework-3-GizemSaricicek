package com.isbasi.Repository;

import com.isbasi.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {

    private static List<Customer> customerList = new ArrayList<>();
    public Customer save(Customer request) { //customer oluşturmak için metod
        customerList.add(request);
        return request;
    }

    public List<Customer> findAll() {
        return customerList;
    }

    public List<Customer> findAllByStatus(String requestStatus) { //statuse göre customer döndürmek için metod
        List<Customer> statusCustomerList = new ArrayList<>();
        for (Customer item : customerList) {
            if(item.getStatus().equals(requestStatus)){
                statusCustomerList.add(item);
            }
        }
        return statusCustomerList;
    }

    public Customer updateByName(Customer customerRequest) {
        for(Customer item: customerList) { // liste geziliyor.
            if(item.getName().equals(customerRequest.getName())){ // hesap numarası uyan varsa
                item.setName(customerRequest.getName()); //update işlemleri yapılıyor.
                item.setAge(customerRequest.getAge());
                item.setStatus(customerRequest.getStatus());
            }
        }
        return customerRequest;
    }

    public List<Customer> deleteByStatus(String status) { //status'e göre silme yapacak metod
        for(Customer item: customerList) {
            if(item.getStatus().equals(status)){
                customerList.remove(item);
            }
        }
        return customerList;
    }

}
