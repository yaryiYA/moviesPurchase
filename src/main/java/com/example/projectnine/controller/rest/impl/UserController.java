package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.AbstractController;
import com.example.projectnine.entity.Users;

import com.example.projectnine.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends AbstractController<Users, UserServiceImpl> {
    public UserController(UserServiceImpl service) {
        super(service);
    }


}
