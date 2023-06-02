package com.example.projectnine.dto.director;

import com.example.projectnine.dto.AbstractRequestDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Director} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(name = "Request director", description = " request dto director")
public class RequestDirectorDto extends AbstractRequestDto implements Serializable {
    @Schema(description = "field uuid", example = "id")
    private final UUID id;
    @Schema(description = "field firstName", example = "Ivan")
    private final String firstName;
    @Schema(description = "field lastName", example = "Ivanov")
    private final String lastName;
    @Schema(description = "field job title", example = "general director")
    private final String position;
}