package com.example.projectnine.service.impl;

import com.example.projectnine.dto.role.RequestRoleDto;
import com.example.projectnine.dto.role.ResponseRoleDto;
import com.example.projectnine.entity.Role;
import com.example.projectnine.mapper.CommonMapper;
import com.example.projectnine.mapper.role.RoleCommonMapper;
import com.example.projectnine.repository.impl.RoleRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseService<Role, RoleRepository, RequestRoleDto, ResponseRoleDto, RoleCommonMapper> {
    @Autowired
    public RoleServiceImpl(RoleRepository repository, RoleCommonMapper commonMapper) {
        super(repository, commonMapper);
    }
}
