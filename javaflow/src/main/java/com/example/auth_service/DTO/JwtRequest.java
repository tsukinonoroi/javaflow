package com.example.auth_service.DTO;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
