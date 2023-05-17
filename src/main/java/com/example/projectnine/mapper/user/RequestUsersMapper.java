package com.example.projectnine.mapper.user;

import com.example.projectnine.dto.user.RequestUsersDto;
import com.example.projectnine.entity.Users;
import com.example.projectnine.mapper.RequestCommonMapper;
import com.example.projectnine.mapper.role.RequestRoleMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {RequestRoleMapper.class})
public interface RequestUsersMapper extends RequestCommonMapper<RequestUsersDto, Users> {
}