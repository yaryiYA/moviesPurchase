package com.example.projectnine.service.impl;

import com.example.projectnine.dto.director.RequestDirectorDto;
import com.example.projectnine.dto.director.ResponseDirectorDto;
import com.example.projectnine.entity.Director;
import com.example.projectnine.entity.Film;
import com.example.projectnine.mapper.director.DirectorCommonMapper;
import com.example.projectnine.repository.impl.DirectorRepository;
import com.example.projectnine.repository.impl.FilmRepository;
import com.example.projectnine.service.BaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class DirectorServiceImpl extends BaseService<Director, DirectorRepository, RequestDirectorDto, ResponseDirectorDto, DirectorCommonMapper> {

    private final FilmRepository filmRepository;

    @Autowired
    public DirectorServiceImpl(DirectorRepository repository, DirectorCommonMapper commonMapper, FilmRepository filmRepository) {
        super(repository, commonMapper);
        this.filmRepository = filmRepository;
    }

    public ResponseDirectorDto addFilm(UUID filmId, UUID directorID) {
        Director director = super.repository.findById(filmId)
                .orElseThrow(() -> new EntityNotFoundException("not found film"));

        Film film = filmRepository.findById(filmId)
                .orElseThrow(() -> new EntityNotFoundException("not found film"));

        Set<Film> films = director.getFilms();

        if (!films.contains(film)) {
            films.add(film);
            director.setFilms(films);
            super.repository.save(director);
        }
        return super.commonMapper.toResponse(director);
    }

}
