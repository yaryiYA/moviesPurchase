package com.example.projectnine.mapper;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.entity.AbstractEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.lang.NonNull;


public interface CommonMapper<E extends AbstractEntity, Q extends AbstractRequestDto, S extends AbstractResponseDto> {

    E toEntity(Q request);

    E partialUpdate(Q request, @MappingTarget E entity);

    S toResponse(E entity);
}
