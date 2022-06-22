package com.isbasi.service;

import com.isbasi.Repository.UserRepository;
import com.isbasi.model.Customer;
import com.isbasi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //@Autowired
    //private RabbitMQService rabbitMQService;

    //@Autowired
    //private AmqpTemplate rabbitTemplate;

    public User createUser(User request) {

        //rabbitTemplate.convertAndSend("isbasi.email", request.getEmail());

        //rabbitMQService.sendEmail(request.getEmail());

        return userRepository.save(request);
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public User getUserByEmail(String email) {
        //kullanıcı bulunamadığında hata verilmeli

        //userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException());

        //userRepository.findByEmail(email).orElseThrow(RuntimeException::new);

        boolean isPresent = userRepository.findByEmail(email).isPresent();
        if (isPresent) {
            return userRepository.findByEmail(email).get();
        }
        return null; // null dönme
    }

    public List<Customer> getCustomersByEmail(String email) {
        Optional<User> foundUser = userRepository.findByEmail(email);

        if (foundUser.isPresent()) {
            return foundUser.get().getCustomerList();
        }
        return null;
    }
}
