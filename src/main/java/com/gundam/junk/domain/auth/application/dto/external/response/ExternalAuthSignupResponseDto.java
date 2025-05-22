package com.gundam.junk.domain.auth.application.dto.external.response;

import lombok.Getter;

@Getter
public class ExternalAuthSignupResponseDto {

    private final String loginId;
    private final String username;
    private final String role;

    private ExternalAuthSignupResponseDto(
        String loginId,
        String username,
        String role
    ) {
        this.loginId = loginId;
        this.username = username;
        this.role = role;
    }

    public static ExternalAuthSignupResponseDto of(
        String loginId,
        String username,
        String role
    ) {
        return new ExternalAuthSignupResponseDto(
            loginId,
            username,
            role
        );
    }
}
