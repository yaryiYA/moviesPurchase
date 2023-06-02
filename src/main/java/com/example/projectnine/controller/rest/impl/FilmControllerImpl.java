package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.service.impl.FilmServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/film")
@Tag(name = " film controller", description = " crud actions with the film entity")
@SecurityRequirement(name = "basic")
public class FilmControllerImpl extends BaseController<Film, RequestFilmDto, ResponseFilmDto, FilmServiceImpl> {
    protected FilmControllerImpl(FilmServiceImpl service) {
        super(service);
    }

    @Override
    @Operation(summary = "get all film")
    public List<ResponseFilmDto> getAll() {
        return super.getAll();
    }

    @Override
    @Operation(summary = "call one entity by id")
    public Optional<ResponseFilmDto> getEntity(UUID uuid) {
        return super.getEntity(uuid);
    }

    @Override
    @Operation(summary = "create new film")
    public ResponseFilmDto createEntity(RequestFilmDto entity) {
        return super.createEntity(entity);
    }

    @Override
    @Operation(summary = "update film for id ")
    public ResponseFilmDto updateEntity(RequestFilmDto entity, UUID uuid) {
        return super.updateEntity(entity, uuid);
    }

    @Override
    @Operation(summary = " delete film for id")
    public void deleteEntity(UUID uuid) {
        super.deleteEntity(uuid);
    }
}
