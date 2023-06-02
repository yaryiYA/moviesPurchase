package com.example.projectnine.mapper.role;

import com.example.projectnine.dto.role.RequestRoleDto;
import com.example.projectnine.dto.role.ResponseRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring")
public interface RoleCommonMapper extends CommonMapper<Role, RequestRoleDto, ResponseRoleDto> {
}
