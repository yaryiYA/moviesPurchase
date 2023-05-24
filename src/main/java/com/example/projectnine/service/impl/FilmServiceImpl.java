package com.example.projectnine.service.impl;

import com.example.projectnine.entity.Film;
import com.example.projectnine.repository.impl.FilmRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl extends BaseService<Film, FilmRepository> {
    @Autowired
    public FilmServiceImpl(FilmRepository repository) {
        super(repository);
    }


}
