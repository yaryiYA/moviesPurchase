package com.example.projectnine.dto.film;

import com.example.projectnine.dto.director.RequestDirectorDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Film} entity
 */
@Data
public class RequestFilmDto implements Serializable {
    private final UUID id;
    private final String title;
    private final String country;
    private final Set<RequestDirectorDto> directors;
}