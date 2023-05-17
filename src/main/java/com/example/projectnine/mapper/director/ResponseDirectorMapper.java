package com.example.projectnine.mapper.director;

import com.example.projectnine.dto.director.ResponseDirectorDto;
import com.example.projectnine.entity.Director;
import com.example.projectnine.mapper.ResponseCommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResponseDirectorMapper extends ResponseCommonMapper<ResponseDirectorDto, Director> {
}