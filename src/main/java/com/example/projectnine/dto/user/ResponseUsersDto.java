package com.example.projectnine.dto.user;

import com.example.projectnine.dto.AbstractResponseDto;
import com.example.projectnine.dto.role.ResponseRoleDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Users} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(name = "Response user", description = "Response user dto")
public class ResponseUsersDto extends AbstractResponseDto implements Serializable {
    @Schema(name = "field firstNae" ,example = "Ivan")
    private final String firstName;
    @Schema(name = "field lastName" ,example = "Ivanov")
    private final String lastName;
    @Schema(name = "field role" ,example = " role UUID")
    private final ResponseRoleDto role;
    @Schema(name = "field login" ,example = "admin")
    private final String login;
    @Schema(name = "field password" ,example = "password")
    private final String password;
}