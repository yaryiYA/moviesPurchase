package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.entity.Order;

import com.example.projectnine.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController extends BaseController<Order, OrderServiceImpl> {

    public OrderController(OrderServiceImpl service) {
        super(service);
    }
}
