package com.example.projectnine.repository.impl;

import com.example.projectnine.entity.Film;
import com.example.projectnine.entity.Users;
import com.example.projectnine.repository.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface UsersRepository extends CommonRepository<Users> {
    Users findByLogin(String login);

    @Query("select f from  Order o join o.film f join o.users u where  u.id=:id ")
    List<Film> findFilmsByUser(@Param("id") UUID uuid);

}