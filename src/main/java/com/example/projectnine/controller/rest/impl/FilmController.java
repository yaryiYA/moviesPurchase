package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.AbstractController;
import com.example.projectnine.entity.Film;

import com.example.projectnine.service.impl.FilmServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/film")
public class FilmController extends AbstractController<Film, FilmServiceImpl> {
    public FilmController(FilmServiceImpl service) {
        super(service);
    }
}
