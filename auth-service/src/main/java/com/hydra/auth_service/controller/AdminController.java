package com.hydra.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/api/admin/secret")
    public String adminOnly() {
        return "You are an ADMIN";
    }
}
