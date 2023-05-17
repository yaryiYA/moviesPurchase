package com.example.projectnine.repository.impl;

import com.example.projectnine.entity.Users;
import com.example.projectnine.repository.CommonRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends CommonRepository<Users> {
    Users findByLogin(String login);
}