package com.example.projectnine.dto.director;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Director} entity
 */
@Data
public class ResponseDirectorDto implements Serializable {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String position;
}