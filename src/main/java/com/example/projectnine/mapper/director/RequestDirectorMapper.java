package com.example.projectnine.mapper.director;

import com.example.projectnine.dto.director.RequestDirectorDto;
import com.example.projectnine.entity.Director;
import com.example.projectnine.mapper.RequestCommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RequestDirectorMapper extends RequestCommonMapper<RequestDirectorDto, Director> {
}