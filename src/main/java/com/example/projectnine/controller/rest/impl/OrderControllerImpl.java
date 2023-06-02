package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.order.RequestOrderDto;
import com.example.projectnine.dto.order.ResponseOrderDto;
import com.example.projectnine.entity.Order;
import com.example.projectnine.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderControllerImpl extends BaseController<Order, RequestOrderDto, ResponseOrderDto, OrderServiceImpl> {

    protected OrderControllerImpl(OrderServiceImpl service) {
        super(service);
    }
}
