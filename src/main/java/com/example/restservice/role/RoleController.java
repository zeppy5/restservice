package com.example.restservice.role;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @GetMapping("/roles")
    public List<Role> role() {
        return Role.getRoleList();
    }

}
