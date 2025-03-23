package com.example.auth_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegistrationUserDTO {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;

}
