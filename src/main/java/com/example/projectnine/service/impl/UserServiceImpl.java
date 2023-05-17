package com.example.projectnine.service.impl;

import com.example.projectnine.entity.Users;
import com.example.projectnine.repository.impl.UsersRepository;
import com.example.projectnine.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractService<Users, UsersRepository> {
    public UserServiceImpl(UsersRepository repository) {
        super(repository);
    }
}
