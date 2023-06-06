package com.example.projectnine.service.impl;

import com.example.projectnine.dto.order.RequestOrderDto;
import com.example.projectnine.dto.order.ResponseOrderDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.entity.Order;
import com.example.projectnine.entity.Users;
import com.example.projectnine.mapper.order.OrderCommonMapper;
import com.example.projectnine.repository.impl.FilmRepository;
import com.example.projectnine.repository.impl.OrderRepository;
import com.example.projectnine.repository.impl.UsersRepository;
import com.example.projectnine.service.BaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class OrderServiceImpl extends BaseService<Order, OrderRepository, RequestOrderDto, ResponseOrderDto, OrderCommonMapper> {
    private final FilmRepository filmRepository;
    private final UsersRepository usersRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository repository, OrderCommonMapper commonMapper, FilmRepository filmRepository, UsersRepository usersRepository) {
        super(repository, commonMapper);
        this.filmRepository = filmRepository;
        this.usersRepository = usersRepository;
    }

    public ResponseOrderDto filmRental(UUID userID, UUID filmID) {
        Film film = filmRepository.findById(filmID)
                .orElseThrow(() -> new EntityNotFoundException("film not found"));

        Users user = usersRepository.findById(userID)
                .orElseThrow(() -> new EntityNotFoundException("user not found"));
        Order order = new Order();
        order.setFilm(film);
        order.setUsers(user);
        order.setId(UUID.randomUUID());
        order.setPrice(BigDecimal.valueOf(Math.random()));
        super.repository.save(order);
        return super.commonMapper.toResponse(order);
    }
}
