package com.example.projectnine.mapper.order;

import com.example.projectnine.dto.order.ResponseOrderDto;
import com.example.projectnine.entity.Order;
import com.example.projectnine.mapper.ResponseCommonMapper;
import com.example.projectnine.mapper.film.ResponseFilmMapper;
import com.example.projectnine.mapper.user.ResponseUsersMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {ResponseUsersMapper.class, ResponseFilmMapper.class})
public interface ResponseOrderMapper extends ResponseCommonMapper<ResponseOrderDto, Order> {
}