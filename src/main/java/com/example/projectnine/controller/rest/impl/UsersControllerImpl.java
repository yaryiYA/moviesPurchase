package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.user.RequestUsersDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Users;
import com.example.projectnine.service.impl.UsersServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UsersControllerImpl extends BaseController<Users, RequestUsersDto, ResponseUsersDto, UsersServiceImpl> {

    final UsersServiceImpl usersService;

    protected UsersControllerImpl(UsersServiceImpl service, UsersServiceImpl usersService) {
        super(service);
        this.usersService = usersService;
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody Users user) {
        usersService.registerUser(user);
    }
}
