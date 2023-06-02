package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.dto.director.RequestDirectorDto;
import com.example.projectnine.dto.director.ResponseDirectorDto;
import com.example.projectnine.entity.Director;
import com.example.projectnine.service.impl.DirectorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/director")
@Tag(name = " director controller", description = " crud actions with the director entity")
public class DirectorControllerImpl extends BaseController<Director, RequestDirectorDto, ResponseDirectorDto, DirectorServiceImpl> {
    protected DirectorControllerImpl(DirectorServiceImpl service) {
        super(service);
    }

    @Override
    @Operation(summary = "get all directors")
    public List<ResponseDirectorDto> getAll() {
        return super.getAll();
    }

    @Override
    @Operation(summary = "call one entity by id")

    public Optional<ResponseDirectorDto> getEntity(@Parameter(description = "director ID",required = true) UUID uuid) {
        return super.getEntity(uuid);
    }

    @Override
    @Operation(summary = "create new director")
    public ResponseDirectorDto createEntity(@Parameter(description = "object director",required = true) RequestDirectorDto entity) {
        return super.createEntity(entity);
    }

    @Override
    @Operation(summary = "update director for id ")
    public ResponseDirectorDto updateEntity(@Parameter(description = "object director",required = true) RequestDirectorDto entity
            , @Parameter(description = "director ID",required = true) UUID uuid) {
        return super.updateEntity(entity, uuid);
    }

    @Override
    @Operation(summary = " delete director for id")
    public void deleteEntity(@Parameter(description = "director ID",required = true) UUID uuid) {
        super.deleteEntity(uuid);
    }
}
