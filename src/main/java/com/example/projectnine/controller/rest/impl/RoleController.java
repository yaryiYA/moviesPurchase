package com.example.projectnine.controller.rest.impl;


import com.example.projectnine.controller.rest.AbstractController;
import com.example.projectnine.entity.Role;

import com.example.projectnine.service.impl.RoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController extends AbstractController<Role, RoleServiceImpl> {

    public RoleController(RoleServiceImpl service) {
        super(service);
    }
}
