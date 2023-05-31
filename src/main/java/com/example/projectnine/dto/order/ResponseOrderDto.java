package com.example.projectnine.dto.order;

import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Order} entity
 */
@Data
public class ResponseOrderDto extends AbstractResponseDto implements Serializable {
    private final UUID id;
    private final ResponseUsersDto users;
    private final BigDecimal price;
    private final Set<ResponseFilmDto> films;
}