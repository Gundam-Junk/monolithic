package com.gundam.junk.domain.auth.presentation.internal.controller;

import com.gundam.junk.domain.auth.application.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/internal/auth")
public class AuthInternalController {

    private final AuthService authService;

}
