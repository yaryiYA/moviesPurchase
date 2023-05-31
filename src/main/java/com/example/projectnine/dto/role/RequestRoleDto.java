package com.example.projectnine.dto.role;

import com.example.projectnine.dto.AbstractRequestDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Role} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RequestRoleDto extends AbstractRequestDto implements Serializable {
    private final UUID id;
    private final String title;
}