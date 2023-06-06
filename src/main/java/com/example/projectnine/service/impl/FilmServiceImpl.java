package com.example.projectnine.service.impl;

import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.entity.Director;
import com.example.projectnine.entity.Film;
import com.example.projectnine.mapper.film.FilmCommonMapper;
import com.example.projectnine.repository.impl.DirectorRepository;
import com.example.projectnine.repository.impl.FilmRepository;
import com.example.projectnine.service.BaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class FilmServiceImpl extends BaseService<Film, FilmRepository, RequestFilmDto, ResponseFilmDto, FilmCommonMapper> {
    private final DirectorRepository directorRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository repository, FilmCommonMapper commonMapper, DirectorRepository directorRepository) {
        super(repository, commonMapper);
        this.directorRepository = directorRepository;
    }

    public ResponseFilmDto addDirector(UUID directorId, UUID filmId) {
        Film film = super.repository.findById(filmId)
                .orElseThrow(() -> new EntityNotFoundException(" film not found"));

        Director director = directorRepository.findById(directorId)
                .orElseThrow(() -> new EntityNotFoundException(" director not found"));

        Set<Director> directors = film.getDirectors();
        if (!directors.contains(director)) {
            directors.add(director);
            film.setDirectors(directors);
            super.repository.save(film);
        }
        return super.commonMapper.toResponse(film);
    }
}
