package com.example.projectnine.service;

import com.example.projectnine.entity.AbstractEntity;
import com.example.projectnine.repository.CommonRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class BaseService<E extends AbstractEntity,R extends CommonRepository<E>>
                    implements CommonService<E>{

    final R repository;
    @Autowired
    public BaseService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<E> findEntity(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public E create(E object) {
        return repository.save(object);
    }

    @Override
    public E update(UUID uuid, E object) {
        if (repository.findById(uuid).isEmpty()) {
            throw new EntityNotFoundException("not found " + uuid);
        }
      return repository.save(object);
    }
    @Override
    public void delete(UUID uuid) {
        repository.deleteById(uuid);

    }
}
