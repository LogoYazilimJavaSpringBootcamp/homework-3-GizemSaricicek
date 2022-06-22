package com.isbasi.service;

import com.isbasi.Repository.CustomerRepository;
import com.isbasi.model.Customer;
import com.isbasi.model.Order;
import com.isbasi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CustomerService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public Customer create(String name) {
        Customer customer = new Customer(name, 25, "passive", new ArrayList<>());

        System.out.println("orderService:" + orderService.toString());
        // orderService.createOrder();

        System.out.println("productService:" + productService.toString());

        return customer;
    }

    private List<Customer> prepareCustomerList() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("bilisim.io", 25, "active", new ArrayList<>()));
        customers.add(new Customer("cem", 30, "active", prepareOrderList()));
        customers.add(new Customer("ömer", 21, "passive", prepareOrderList()));
        customers.add(new Customer("haluk", 32, "active", prepareOrderList()));
        customers.add(new Customer("halil", 25, "passive",prepareOrderList()));
        customers.add(new Customer("fatih", 18,  "active",prepareOrderList()));
        return customers;
    }

    private List<Order> prepareOrderList() {
        List<Order> orders = new ArrayList<>();
        int randomOrderNumber = new Random().nextInt(5);
        for (int i = 0; i < randomOrderNumber; i++) {
            Order order = new Order(prepareProductList(randomOrderNumber));
            orders.add(order);
        }
        return orders;
    }

    private List<Product> prepareProductList(int randomOrderNumber) {
        List<Product> products = new ArrayList<>();
        Random random = new Random();
        products.add(new Product("MacBook Pro", random.nextDouble(1000)));
        products.add(new Product("MacBook air", random.nextDouble(1000)));
        products.add(new Product("Mac Mini", random.nextDouble(1000)));
        products.add(new Product("iPhone 11", random.nextDouble(1000)));
        products.add(new Product("iPhone 12", random.nextDouble(1000)));

        return products.stream().limit(randomOrderNumber).toList();
    }

    public List<Customer> getAllCustomers() {

        // ProductService productService = new ProductService;
        // singleton olduğunun kanıtı
        //System.out.println("CustomerService - productService:" + productService.toString());
        //System.out.println("CustomerService - productService:" + productService.url);
        //System.out.println("CustomerService - orderService:" + orderService.toString());
        //orderService.createOrder();
        //return prepareCustomerList();

        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer request) { //yeni bir customer oluşturulması için metod

        return customerRepository.save(request);
    }

    public Customer getByStatus(String requestStatus) { //status'e göre customer aramak için metod
        boolean isPresent = customerRepository.findAllByStatus(requestStatus).isPresent();
        if(isPresent){
            return customerRepository.findAllByStatus(requestStatus).get();
        }
        else{
            return null; //best practice'de null return etmemeliyiz.
        }
    }
}
