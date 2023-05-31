package com.example.projectnine.dto.role;

import com.example.projectnine.dto.AbstractResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Role} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data

public class ResponseRoleDto extends AbstractResponseDto implements Serializable {
    private final UUID id;
    private final String title;
}