package com.example.projectnine.service;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.entity.AbstractEntity;
import com.example.projectnine.repository.CommonRepository;
import com.example.projectnine.mapper.CommonMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public abstract class BaseService
        <E extends AbstractEntity,
                R extends CommonRepository<E>,
                Q extends AbstractRequestDto,
                S extends AbstractResponseDto,
                M extends CommonMapper<E, Q, S>>

        implements CommonService<E, Q, S> {

    protected final R repository;
    protected final M commonMapper;


    public BaseService(R repository, M commonMapper) {
        this.repository = repository;
        this.commonMapper = commonMapper;
    }

    @Override
    public List<S> findAll() {
        return repository.findAll().stream()
                .map(commonMapper::toResponse)
                .toList();
    }

    @Override
    public Optional<S> findEntity(UUID uuid) {
        return repository.findById(uuid)
                .map(commonMapper::toResponse);
    }

    @Override
    public S create(Q object) {
        E entity = commonMapper.toEntity(object);
        repository.save(entity);
        return commonMapper.toResponse(entity);
    }

    @Override
    public S update(UUID uuid, Q object) {
        if (repository.findById(uuid).isEmpty()) {
            throw new EntityNotFoundException("not found " + uuid);
        }
        E entity = commonMapper.toEntity(object);
        repository.save(entity);

        return commonMapper.toResponse(entity);
    }

    @Override
    public void delete(UUID uuid) {
        repository.deleteById(uuid);

    }
}
