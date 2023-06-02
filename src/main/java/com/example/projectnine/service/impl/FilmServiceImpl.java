package com.example.projectnine.service.impl;

import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.mapper.CommonMapper;
import com.example.projectnine.repository.impl.FilmRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl extends BaseService<Film, FilmRepository, RequestFilmDto, ResponseFilmDto> {
    public FilmServiceImpl(FilmRepository repository, CommonMapper<Film, RequestFilmDto, ResponseFilmDto> commonMapper) {
        super(repository, commonMapper);
    }
}
