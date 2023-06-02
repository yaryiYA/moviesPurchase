package com.example.projectnine.dto.film;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.director.RequestDirectorDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Film} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(name ="Request film", description = "request film dto")
public class RequestFilmDto extends AbstractRequestDto implements Serializable {
    @Schema(name = "field uuid",example = "UUID")
    private final UUID id;
    @Schema(name = "field title",example = "Avatar")
    private final String title;
    @Schema(name = "field country",example = "USA")
    private final String country;
    @Schema(name = "field directors",example = " director UUID")
    private final Set<RequestDirectorDto> directors;
}