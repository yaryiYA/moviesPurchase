package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.order.RequestOrderDto;
import com.example.projectnine.dto.order.ResponseOrderDto;
import com.example.projectnine.entity.Order;
import com.example.projectnine.service.impl.OrderServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/order")
@Tag(name = " order controller", description = " crud actions with the order entity")
@SecurityRequirement(name = "basic")
public class OrderControllerImpl extends BaseController<Order, RequestOrderDto, ResponseOrderDto, OrderServiceImpl> {

    protected OrderControllerImpl(OrderServiceImpl service) {
        super(service);
    }

    @Override
    @Operation(summary = "get all order")
    public List<ResponseOrderDto> getAll() {
        return super.getAll();
    }

    @Override
    @Operation(summary = "call one entity by id")
    public Optional<ResponseOrderDto> getEntity(UUID uuid) {
        return super.getEntity(uuid);
    }

    @Override
    @Operation(summary = "create new order")
    public ResponseOrderDto createEntity(RequestOrderDto entity) {
        return super.createEntity(entity);
    }

    @Override
    @Operation(summary = "update order for id ")
    public ResponseOrderDto updateEntity(RequestOrderDto entity, UUID uuid) {
        return super.updateEntity(entity, uuid);
    }

    @Override
    @Operation(summary = " delete film for id")
    public void deleteEntity(UUID uuid) {
        super.deleteEntity(uuid);
    }

    @GetMapping("/rentFilms")
    @Operation(summary = "make an order")
    public ResponseOrderDto rentFilms(@RequestParam("userId") UUID userId,
                                      @RequestParam("filmId") UUID filmId) {
        return super.service.filmRental(userId, filmId);
    }
}
