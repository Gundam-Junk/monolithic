package com.gundam.junk.domain.user.presentation.internal.controller;

import com.gundam.junk.domain.user.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/internal/users")
public class UserInternalController {

    private final UserService userService;

}
