package com.example.projectnine.service;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.entity.AbstractEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommonService<E extends AbstractEntity,
        Q extends AbstractRequestDto,
        S extends AbstractResponseDto> {
    List<S> findAll();

    Optional<S> findEntity(UUID uuid);

    S create(Q object);

    S update(UUID uuid, Q object);

    void delete(UUID uuid);

}
