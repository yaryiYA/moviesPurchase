package com.example.projectnine.service.impl;

import com.example.projectnine.entity.Order;
import com.example.projectnine.repository.impl.OrderRepository;
import com.example.projectnine.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseService<Order, OrderRepository> {
    public OrderServiceImpl(OrderRepository repository) {
        super(repository);
    }
}
