package com.example.projectnine.mapper.order;

import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.dto.order.RequestOrderDto;
import com.example.projectnine.dto.order.ResponseOrderDto;
import com.example.projectnine.entity.Film;
import com.example.projectnine.entity.Order;
import com.example.projectnine.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring")
public interface OrderCommonMapper extends CommonMapper<Order, RequestOrderDto, ResponseOrderDto> {
}
