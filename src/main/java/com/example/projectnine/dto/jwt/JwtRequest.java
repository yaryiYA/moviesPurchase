package com.example.projectnine.dto.jwt;

import lombok.Data;

@Data
public class JwtRequest {

    private String login;
    private String password;

}
