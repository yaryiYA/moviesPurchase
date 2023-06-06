package com.example.projectnine.dto.order;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.film.RequestFilmDto;
import com.example.projectnine.dto.user.RequestUsersDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Order} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema( name = "Request order",description = "Request order dto")
public class RequestOrderDto extends AbstractRequestDto implements Serializable {

    @Schema(name = "field users" ,example = " users UUID")
    private final RequestUsersDto users;
    @Schema(name = "field price" ,example = "10_00_00")
    private final BigDecimal price;
    @Schema(name = "field films" ,example = "UUID films")
    private final Set<RequestFilmDto> films;
}