package com.example.projectnine.mapper.film;

import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.mapper.ResponseCommonMapper;
import com.example.projectnine.mapper.director.ResponseDirectorMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {ResponseDirectorMapper.class})
public interface ResponseFilmMapper extends ResponseCommonMapper<ResponseFilmDto, Film> {
}