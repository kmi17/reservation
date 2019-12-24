package com.example.demo.controller;

import com.example.demo.model.LoginRequest;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
* Login / Registration of the user
* */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    public void login(@RequestBody LoginRequest loginRequest){
        loginService.login(loginRequest);
    }


}
