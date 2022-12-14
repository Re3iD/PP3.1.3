package ru.kata.pp_3_1_4_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.pp_3_1_4_rest.model.User;
import ru.kata.pp_3_1_4_rest.service.UserService;


@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUser(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("roles", userService.getUserByEmail(user.getUsername()).getRoles());
        model.addAttribute("user", userService.getUserByEmail(user.getUsername()));
        return "user";
    }
}