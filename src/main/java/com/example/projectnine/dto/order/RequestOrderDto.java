package com.example.projectnine.dto.order;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.user.RequestUsersDto;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Order} entity
 */
@Data
public class RequestOrderDto extends AbstractRequestDto implements Serializable {
    private final UUID id;
    private final RequestUsersDto users;
    private final BigDecimal price;
    private final Set<RequestFilmDto> films;
}