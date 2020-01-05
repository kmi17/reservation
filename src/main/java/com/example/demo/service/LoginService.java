package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
    public Optional<User> login(String email){
       Optional<User> user = loginRepository.findByEmail(email);
       return user;
    }

}
