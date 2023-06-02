package com.example.projectnine.controller.rest;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.entity.AbstractEntity;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommonController<E extends AbstractEntity,
        Q extends AbstractRequestDto,
        S extends AbstractResponseDto> {

    @GetMapping("/all")
     public List<S> getAll();
    @GetMapping("/{UUID}")
    public Optional<S> getEntity(@PathVariable("UUID") UUID uuid);

    @PostMapping("/create")
    public S createEntity(@RequestBody Q entity);

    @PutMapping("/update/{UUID}")
    public S updateEntity(@RequestBody Q entity, @PathVariable("UUID") UUID uuid);
    @DeleteMapping("/delete/{UUID}")
    public void deleteEntity(@PathVariable("UUID") UUID uuid);
    }






