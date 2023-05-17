package com.example.projectnine.mapper.role;

import com.example.projectnine.dto.role.RequestRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.mapper.RequestCommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestRoleMapper extends RequestCommonMapper<RequestRoleDto, Role> {
}
