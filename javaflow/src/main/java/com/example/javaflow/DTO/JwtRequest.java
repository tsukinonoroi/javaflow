package com.example.javaflow.DTO;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
