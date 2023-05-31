package com.example.projectnine.dto.director;

import com.example.projectnine.dto.AbstractResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Director} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseDirectorDto  extends AbstractResponseDto implements Serializable {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String position;
}