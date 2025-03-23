package com.example.auth_service.Controller;

import com.example.auth_service.DTO.JwtRequest;

import com.example.auth_service.DTO.RegistrationUserDTO;

import com.example.auth_service.Service.AuthService;
import com.example.auth_service.Service.UserService;
import com.example.auth_service.Util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }

    @PostMapping("/registration")
    public ResponseEntity<?> registration(@RequestBody RegistrationUserDTO registrationUserDTO) {
        return authService.createNewUser(registrationUserDTO);
    }
}

//спрятать логику в сервис , + использование глобальных исключений