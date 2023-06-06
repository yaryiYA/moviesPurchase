package com.example.projectnine.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public abstract class AbstractRequestDto {
    @Schema(description = "field uuid", example = "id")
    private UUID id;
}
