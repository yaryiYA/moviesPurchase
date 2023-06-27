package com.example.projectnine.controller.rest.impl;

import com.example.projectnine.dto.jwt.JwtRequest;
import com.example.projectnine.dto.jwt.JwtResponse;
import com.example.projectnine.exceptions.AuthError;
import com.example.projectnine.security.JwtTokenUtils;
import com.example.projectnine.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final UsersServiceImpl usersService;
    private final JwtTokenUtils jwtTokenUtils;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthController(UsersServiceImpl usersService, JwtTokenUtils jwtTokenUtils, AuthenticationManager authenticationManager) {
        this.usersService = usersService;
        this.jwtTokenUtils = jwtTokenUtils;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authJwtRequest) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authJwtRequest.getLogin(), authJwtRequest.getPassword()));
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(new AuthError(HttpStatus.UNAUTHORIZED.value(), "incorrect data"), HttpStatus.UNAUTHORIZED);
        }
        UserDetails userDetails = usersService.loadUserByUsername(authJwtRequest.getLogin());
        String token = jwtTokenUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));

    }

}
