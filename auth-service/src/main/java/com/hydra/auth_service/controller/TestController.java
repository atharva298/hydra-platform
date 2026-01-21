package com.hydra.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

@RestController
public class TestController {

    @GetMapping("/api/test/secure")
    public String secureEndpoint() {
        return "You have accessed a protected endpoint!";
    }

    @GetMapping("/api/test/me")
        public String me(Authentication authentication) {
            return "Authenticated user email: " + authentication.getName();
        }
}
