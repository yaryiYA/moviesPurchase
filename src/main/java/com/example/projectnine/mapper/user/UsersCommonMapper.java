package com.example.projectnine.mapper.user;

import com.example.projectnine.dto.user.RequestUsersDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Users;
import com.example.projectnine.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring")
public interface UsersCommonMapper extends CommonMapper<Users, RequestUsersDto, ResponseUsersDto> {
}
