package com.amigos.logindemo.services;

import org.springframework.stereotype.Service;

import com.amigos.logindemo.entities.RegistrationRequest;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return " this works";
    }

}
