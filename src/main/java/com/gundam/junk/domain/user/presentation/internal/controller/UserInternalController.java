package com.gundam.junk.domain.user.presentation.internal.controller;

import com.gundam.junk.domain.user.application.dto.interanl.request.InternalUserSignupRequestDto;
import com.gundam.junk.domain.user.application.dto.interanl.response.InternalUserSignupResponseDto;
import com.gundam.junk.domain.user.application.service.UserService;
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
@RequestMapping("/api/v1/internal/users")
public class UserInternalController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<InternalUserSignupResponseDto> signup(
        @RequestBody InternalUserSignupRequestDto requestDto
    ) {
        InternalUserSignupResponseDto responseDto = userService.signup(requestDto);

        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
            .path("/api/v1/users/my-page")
            .build()
            .toUri();

        return ResponseEntity.created(uri).body(responseDto);
    }
}
