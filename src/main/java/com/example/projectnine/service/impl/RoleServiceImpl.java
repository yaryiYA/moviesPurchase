package com.example.projectnine.service.impl;

import com.example.projectnine.dto.role.RequestRoleDto;
import com.example.projectnine.dto.role.ResponseRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.mapper.CommonMapper;
import com.example.projectnine.repository.impl.RoleRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseService<Role, RoleRepository, RequestRoleDto, ResponseRoleDto> {
    public RoleServiceImpl(RoleRepository repository, CommonMapper<Role, RequestRoleDto, ResponseRoleDto> commonMapper) {
        super(repository, commonMapper);
    }
}
