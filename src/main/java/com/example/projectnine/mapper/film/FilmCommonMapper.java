package com.example.projectnine.mapper.film;

import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring")
public interface FilmCommonMapper extends CommonMapper<Film, RequestFilmDto, ResponseFilmDto> {
}
