package com.example.projectnine.service.impl;

import com.example.projectnine.entity.Director;
import com.example.projectnine.repository.impl.DirectorRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl extends BaseService<Director, DirectorRepository> {
    public DirectorServiceImpl(DirectorRepository repository) {
        super(repository);
    }
}
