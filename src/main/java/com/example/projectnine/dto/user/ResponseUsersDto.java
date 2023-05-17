package com.example.projectnine.dto.user;

import com.example.projectnine.dto.role.ResponseRoleDto;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Users} entity
 */
@Data
public class ResponseUsersDto implements Serializable {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final ResponseRoleDto role;
    private final String login;
    private final String password;
}