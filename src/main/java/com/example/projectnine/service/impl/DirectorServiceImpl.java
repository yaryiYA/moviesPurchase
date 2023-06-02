package com.example.projectnine.service.impl;

import com.example.projectnine.dto.director.RequestDirectorDto;
import com.example.projectnine.dto.director.ResponseDirectorDto;
import com.example.projectnine.entity.Director;
import com.example.projectnine.mapper.CommonMapper;
import com.example.projectnine.repository.impl.DirectorRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl extends BaseService<Director, DirectorRepository, RequestDirectorDto, ResponseDirectorDto> {
    public DirectorServiceImpl(DirectorRepository repository, CommonMapper<Director, RequestDirectorDto, ResponseDirectorDto> commonMapper) {
        super(repository, commonMapper);
    }
}
