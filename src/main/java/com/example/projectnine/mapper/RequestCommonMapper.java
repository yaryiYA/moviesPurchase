package com.example.projectnine.mapper;

import org.mapstruct.*;


public interface RequestCommonMapper<D,E>{
    E toEntity(D dto);
    D toDto(E entity);
    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget E entity,D dto);
}
