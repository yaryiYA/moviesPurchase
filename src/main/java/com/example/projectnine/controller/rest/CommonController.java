package com.example.projectnine.controller.rest;

import com.example.projectnine.entity.AbstractEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public interface CommonController <E extends AbstractEntity> {

    @GetMapping("/all")
     public List<E> getAll();

    @GetMapping("/{UUID}")
    public E getEntity(@PathVariable("UUID") UUID uuid);

    @PostMapping("/create")
    public E createEntity(@RequestBody E entity);

    @PutMapping("/update/{UUID}")
    public E updateEntity(@RequestBody E entity, @PathVariable("UUID") UUID uuid);
    @DeleteMapping("/delete/{UUID}")
    public void deleteEntity(@PathVariable("UUID") UUID uuid);
    }






