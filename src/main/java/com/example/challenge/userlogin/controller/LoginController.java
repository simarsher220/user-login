package com.example.challenge.userlogin.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LoginController {

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public void getUser(@PathVariable UUID id) {

    }

    @RequestMapping(value = "/api/users/register", method = RequestMethod.POST)
    public void createUser() {

    }

    @RequestMapping(value = "/api/users/login", method = RequestMethod.POST)
    public void login() {

    }

    @RequestMapping(value = "/auth/secured", method = RequestMethod.GET)
    public void getUserDetails() {

    }

    @RequestMapping(value = "/api/user/updatePassword", method = RequestMethod.PUT)
    public void updatePassword() {

    }

}
