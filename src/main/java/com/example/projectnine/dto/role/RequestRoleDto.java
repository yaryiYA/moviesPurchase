package com.example.projectnine.dto.role;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Role} entity
 */
@Data
public class RequestRoleDto implements Serializable {
    private final UUID id;
    private final String title;
}