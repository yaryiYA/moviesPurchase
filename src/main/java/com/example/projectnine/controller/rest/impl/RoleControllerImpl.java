package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.role.RequestRoleDto;
import com.example.projectnine.dto.role.ResponseRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.service.impl.RoleServiceImpl;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/role")
@Tag(name = " role  controller", description = " crud actions with the role entity")
@SecurityRequirement(name = "basic")
public class RoleControllerImpl extends BaseController<Role, RequestRoleDto, ResponseRoleDto, RoleServiceImpl> {

    protected RoleControllerImpl(RoleServiceImpl service) {
        super(service);
    }

    @Override
    @Operation(summary = "get all roles")
    public List<ResponseRoleDto> getAll() {
        return super.getAll();
    }

    @Override
    @Operation(summary = "call one entity by id")
    public Optional<ResponseRoleDto> getEntity(UUID uuid) {
        return super.getEntity(uuid);
    }

    @Override
    @Operation(summary = "create new role")
    public ResponseRoleDto createEntity(RequestRoleDto entity) {
        return super.createEntity(entity);
    }

    @Override
    @Operation(summary = "update role for id ")
    public ResponseRoleDto updateEntity(RequestRoleDto entity, UUID uuid) {
        return super.updateEntity(entity, uuid);
    }

    @Override
    @Operation(summary = " delete role for id")
    public void deleteEntity(UUID uuid) {
        super.deleteEntity(uuid);
    }
}
