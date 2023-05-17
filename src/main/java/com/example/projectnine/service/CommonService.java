package com.example.projectnine.service;

import com.example.projectnine.entity.AbstractEntity;
import com.example.projectnine.repository.CommonRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommonService<E extends AbstractEntity> {
    List<E> findAll();
    Optional<E> findEntity(UUID uuid);
    E create(E object);
    E update(UUID uuid,E object);
    void delete(UUID uuid);

}
