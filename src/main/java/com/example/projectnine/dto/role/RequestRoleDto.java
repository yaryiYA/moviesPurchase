package com.example.projectnine.dto.role;

import com.example.projectnine.dto.AbstractRequestDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Role} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(name = "Request role", description = "Request role dto")
public class RequestRoleDto extends AbstractRequestDto implements Serializable {
    @Schema(name = "field UUID", example = " Role UUID")
    private final UUID id;
    @Schema(name = "field title", example = " ADMIN")
    private final String title;
}