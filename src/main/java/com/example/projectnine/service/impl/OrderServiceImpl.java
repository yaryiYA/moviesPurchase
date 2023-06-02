package com.example.projectnine.service.impl;

import com.example.projectnine.dto.order.RequestOrderDto;
import com.example.projectnine.dto.order.ResponseOrderDto;
import com.example.projectnine.entity.Order;
import com.example.projectnine.mapper.CommonMapper;
import com.example.projectnine.repository.impl.OrderRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseService<Order, OrderRepository, RequestOrderDto, ResponseOrderDto> {
    public OrderServiceImpl(OrderRepository repository, CommonMapper<Order, RequestOrderDto, ResponseOrderDto> commonMapper) {
        super(repository, commonMapper);
    }
}
