package com.example.projectnine.dto.order;

import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.dto.film.ResponseFilmDto;
import com.example.projectnine.dto.user.ResponseUsersDto;
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
@Schema(name = "Response order", description = "Response order dto")
public class ResponseOrderDto extends AbstractResponseDto implements Serializable {
    @Schema(name = "field users", example = " users UUID")
    private final ResponseUsersDto users;
    @Schema(name = "field price", example = "10_00_00")
    private final BigDecimal price;
    @Schema(name = "field films", example = "UUID films")
    private final Set<ResponseFilmDto> films;
}