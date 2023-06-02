package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.user.RequestUsersDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Users;
import com.example.projectnine.service.impl.UsersServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name = " user  controller", description = " crud and register actions with the user entity")
public class UsersControllerImpl extends BaseController<Users, RequestUsersDto, ResponseUsersDto, UsersServiceImpl> {

    final UsersServiceImpl usersService;

    protected UsersControllerImpl(UsersServiceImpl service, UsersServiceImpl usersService) {
        super(service);
        this.usersService = usersService;
    }

    @PostMapping("/register")
    @Operation(summary = "user registration")
    public void registerUser(@RequestBody Users user) {
        usersService.registerUser(user);
    }

    @Override
    @Operation(summary = "get all users")
    public List<ResponseUsersDto> getAll() {
        return super.getAll();
    }

    @Override
    @Operation(summary = "call one entity by id")
    public Optional<ResponseUsersDto> getEntity(UUID uuid) {
        return super.getEntity(uuid);
    }

    @Override
    @Operation(summary = "create new user")
    public ResponseUsersDto createEntity(RequestUsersDto entity) {
        return super.createEntity(entity);
    }

    @Override
    @Operation(summary = "update user for id ")
    public ResponseUsersDto updateEntity(RequestUsersDto entity, UUID uuid) {
        return super.updateEntity(entity, uuid);
    }

    @Override
    @Operation(summary = " delete user for id")
    public void deleteEntity(UUID uuid) {
        super.deleteEntity(uuid);
    }
}
