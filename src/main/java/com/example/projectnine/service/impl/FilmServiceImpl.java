package com.example.projectnine.service.impl;

import com.example.projectnine.entity.Director;
import com.example.projectnine.entity.Film;
import com.example.projectnine.repository.impl.FilmRepository;
import com.example.projectnine.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class FilmServiceImpl extends AbstractService<Film, FilmRepository> {
    @Autowired
    public FilmServiceImpl(FilmRepository repository) {
        super(repository);
    }


}
