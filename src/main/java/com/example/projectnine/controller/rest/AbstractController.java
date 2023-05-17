package com.example.projectnine.controller.rest;

import com.example.projectnine.entity.AbstractEntity;
import com.example.projectnine.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>>
        implements CommonController<E> {

    private final S service;
    @Autowired
    public AbstractController(S service) {
        this.service = service;
    }

    @Override
    public List<E> getAll() {
        return service.findAll();
    }

    @Override
    public E getEntity(UUID uuid) {
        return service.findEntity(uuid).get();
    }

    @Override
    public E createEntity(E entity) {
        return service.create(entity);
    }

    @Override
    public E updateEntity(E entity, UUID uuid) {
        return service.update(uuid,entity);
    }

    @Override
    public void deleteEntity(UUID uuid) {
        service.delete(uuid);
    }
}
