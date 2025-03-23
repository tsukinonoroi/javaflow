package com.example.auth_service.Service;

import com.example.auth_service.Model.Role;
import com.example.auth_service.Repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findRoleByName("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("Role 'ROLE_USER' not found"));
    }

    public Role getAdminRole() {
        return roleRepository.findRoleByName("ROLE_ADMIN")
                .orElseThrow(() -> new RuntimeException("Role 'ROLE_ADMIN not found"));
    }
}
