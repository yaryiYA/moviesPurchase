package com.example.projectnine.mapper.role;

import com.example.projectnine.dto.role.ResponseRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.mapper.ResponseCommonMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseRoleMapper extends ResponseCommonMapper<ResponseRoleDto, Role> {
}
