package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.entity.Users;

import com.example.projectnine.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends BaseController<Users, UserServiceImpl> {

    final UserServiceImpl userService;
    public UserController(UserServiceImpl service, UserServiceImpl userService) {
        super(service);
        this.userService = userService;
    }


    @PostMapping("/register")
    public void registerUser(@RequestBody Users user){
        userService.registerUser(user);
    }


}
