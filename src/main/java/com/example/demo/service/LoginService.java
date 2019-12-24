package com.example.demo.service;

import com.example.demo.model.LoginRequest;
import com.example.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public void login(LoginRequest loginRequest){

    }

}
