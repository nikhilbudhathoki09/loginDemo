package com.amigos.logindemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.logindemo.entities.RegistrationRequest;
import com.amigos.logindemo.services.RegistrationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/registration")
@AllArgsConstructor
public class RegisterController {

    private RegistrationService registrationService;

    @PostMapping()
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

}
