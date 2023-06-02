package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.role.RequestRoleDto;
import com.example.projectnine.dto.role.ResponseRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.service.impl.RoleServiceImpl;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role")
public class RoleControllerImpl extends BaseController<Role, RequestRoleDto, ResponseRoleDto, RoleServiceImpl> {

    protected RoleControllerImpl(RoleServiceImpl service) {
        super(service);
    }
}
