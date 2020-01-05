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


/*
* Flow of the app
*
* Controller -> Service -> Repository
* 1. Request comes to controller, controller is a dummy just routes
* to the appropriate service.
* 2. Service owns the business logic and asks the repository and do what is required.
*
* Service will send something based on that controller will return the error code along with
* some data if required
*
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
