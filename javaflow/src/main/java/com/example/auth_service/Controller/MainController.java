package com.example.auth_service.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @Operation(summary = "Получить незащищенные данные")
    @GetMapping("/unsecured")
    public String unsecuredData() {
        return "unsecured data";
    }

    @Operation(summary = "Получтиь защищённые данные")
    @GetMapping("/secured")
    public String securedData() {
        return "secured Data";
    }
    @Operation(summary = "админ-панель")
    @GetMapping("/admin")
    public String adminData() {
        return "Admin data";
    }
    @Operation(summary = "инфа о юзере (авторизированном)")
    @GetMapping("/info")
    public String userData(Principal principal) {
        return principal.getName();
    }
}
