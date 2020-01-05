package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/*
* Login / Registration of the user
* */

@RestController
public class LoginController {
    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @GetMapping("/login/{username}")
    public Optional<User> login(@PathVariable(value = "username") String email){
        Optional<User> user = loginService.login(email);
        return user;
    }

}
