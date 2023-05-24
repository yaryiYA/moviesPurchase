package com.example.projectnine.service.logic;

import com.example.projectnine.entity.Director;
import com.example.projectnine.entity.Film;
import com.example.projectnine.repository.impl.DirectorRepository;
import com.example.projectnine.repository.impl.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class LogicService {
     private FilmRepository filmRepository;
     private DirectorRepository directorRepository;


    public LogicService(FilmRepository filmRepository, DirectorRepository directorRepository) {
        this.filmRepository = filmRepository;
        this.directorRepository = directorRepository;
    }




}
