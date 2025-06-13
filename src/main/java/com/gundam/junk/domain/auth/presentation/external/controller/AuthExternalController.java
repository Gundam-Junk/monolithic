package com.gundam.junk.domain.auth.presentation.external.controller;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.application.dto.external.response.ExternalAuthSignupResponseDto;
import com.gundam.junk.domain.auth.application.service.AuthService;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthExternalController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<ExternalAuthSignupResponseDto> signup(
        @RequestBody ExternalAuthSignupRequestDto requestDto
    ) {
        ExternalAuthSignupResponseDto responseDto = authService.signup(requestDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
            .path("/api/v1/users/my-page")
            .build()
            .toUri();

        return ResponseEntity.created(uri).body(responseDto);
    }
}
