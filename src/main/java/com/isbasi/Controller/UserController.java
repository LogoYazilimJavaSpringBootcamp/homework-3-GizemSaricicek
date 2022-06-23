package com.isbasi.Controller;

import java.util.List;

import com.isbasi.model.Customer;
import com.isbasi.model.User;
import com.isbasi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping //yeni user oluşturmak için endpoint
    public User createUser(@RequestBody User userRequest) {
        return userService.createUser(userRequest);
    }

    @GetMapping //tüm user'ları görüntülemek için endpoint
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{email}") //email'e göre user görüntülemek için endpoint
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping(value = "/{email}/customers") //girilen emaile sahip user'ların customer'larını görüntülemek için endpoint
    public List<Customer> getCustomersUserByEmail(@PathVariable String email) {
        return userService.getCustomersByEmail(email);
    }
}
