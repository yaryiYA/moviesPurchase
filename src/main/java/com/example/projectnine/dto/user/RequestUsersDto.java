package com.example.projectnine.dto.user;

import com.example.projectnine.dto.role.RequestRoleDto;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Users} entity
 */
@Data
public class RequestUsersDto implements Serializable {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final RequestRoleDto role;
    private final String login;
    private final String password;
}