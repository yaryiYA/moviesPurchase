package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.controller.rest.BaseController;
import com.example.projectnine.entity.Director;

import com.example.projectnine.service.impl.DirectorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/director")
public class DirectorController extends BaseController<Director, DirectorServiceImpl> {
    public DirectorController(DirectorServiceImpl service) {
        super(service);
    }
}
