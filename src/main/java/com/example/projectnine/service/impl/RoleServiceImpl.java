package com.example.projectnine.service.impl;

import com.example.projectnine.entity.AbstractEntity;
import com.example.projectnine.entity.Role;
import com.example.projectnine.repository.impl.RoleRepository;
import com.example.projectnine.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends AbstractService<Role, RoleRepository> {
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}
