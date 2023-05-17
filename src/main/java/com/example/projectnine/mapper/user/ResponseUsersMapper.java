package com.example.projectnine.mapper.user;

import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Users;
import com.example.projectnine.mapper.ResponseCommonMapper;
import com.example.projectnine.mapper.role.ResponseRoleMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {ResponseRoleMapper.class})
public interface ResponseUsersMapper extends ResponseCommonMapper<ResponseUsersDto, Users> {
}