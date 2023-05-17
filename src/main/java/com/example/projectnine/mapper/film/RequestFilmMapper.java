package com.example.projectnine.mapper.film;

import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.mapper.RequestCommonMapper;
import com.example.projectnine.mapper.director.RequestDirectorMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {RequestDirectorMapper.class})
public interface RequestFilmMapper extends RequestCommonMapper<RequestFilmDto, Film> {
}