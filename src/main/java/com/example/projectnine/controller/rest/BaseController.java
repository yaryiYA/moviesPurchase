package com.example.projectnine.controller.rest;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.entity.AbstractEntity;
import com.example.projectnine.service.CommonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class BaseController <E extends AbstractEntity,
        Q extends AbstractRequestDto,
        S extends AbstractResponseDto,
        V extends CommonService<E,Q,S>>
        implements CommonController<E,Q,S> {
    protected V service;

    protected BaseController(V service) {
        this.service = service;
    }
    @Override
    public List<S> getAll() {
        return service.findAll();
    }

    @Override
    public Optional<S> getEntity(@Parameter(description = "entity ID",required = true)UUID uuid) {
        return service.findEntity(uuid);
    }

    @Override
    public S createEntity(@Parameter(description = " post object",required = true) Q entity) {
        return service.create(entity);
    }

    @Override
    public S updateEntity(Q entity, UUID uuid) {
        return service.update(uuid,entity);
    }

    @Override
    @Parameter(description = "entity ID",required = true)
    public void deleteEntity(UUID uuid) {
        service.delete(uuid);
    }
}
