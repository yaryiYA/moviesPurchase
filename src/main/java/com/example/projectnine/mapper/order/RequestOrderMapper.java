package com.example.projectnine.mapper.order;

import com.example.projectnine.dto.order.RequestOrderDto;
import com.example.projectnine.entity.Order;
import com.example.projectnine.mapper.RequestCommonMapper;
import com.example.projectnine.mapper.film.RequestFilmMapper;
import com.example.projectnine.mapper.user.RequestUsersMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {RequestUsersMapper.class, RequestFilmMapper.class})
public interface RequestOrderMapper extends RequestCommonMapper<RequestOrderDto, Order> {
}