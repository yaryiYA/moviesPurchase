package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.entity.Film;

import com.example.projectnine.service.impl.FilmServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/film")
public class FilmController extends BaseController<Film, FilmServiceImpl> {
    public FilmController(FilmServiceImpl service) {
        super(service);
    }
}
