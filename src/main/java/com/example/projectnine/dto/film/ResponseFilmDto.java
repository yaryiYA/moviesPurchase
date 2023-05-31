package com.example.projectnine.dto.film;

import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.dto.director.ResponseDirectorDto;
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
public class ResponseFilmDto extends AbstractResponseDto implements Serializable {
    private final UUID id;
    private final String title;
    private final String country;
    private final Set<ResponseDirectorDto> directors;
}