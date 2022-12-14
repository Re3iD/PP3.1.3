package ru.kata.pp_3_1_4_rest.controller;

import ru.kata.pp_3_1_4_rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kata.pp_3_1_4_rest.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> listUsers() {
        return userService.listUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        System.out.println(user);
        userService.addUser(user);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void removeUserById(@PathVariable Integer id) {
        userService.removeUserById(id);
    }
}
