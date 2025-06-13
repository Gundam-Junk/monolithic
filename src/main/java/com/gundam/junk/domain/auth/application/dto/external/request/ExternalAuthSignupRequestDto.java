package com.gundam.junk.domain.auth.application.dto.external.request;

import lombok.Getter;

@Getter
public class ExternalAuthSignupRequestDto {

    private final String loginId;
    private final String password;
    private final String username;

    private ExternalAuthSignupRequestDto(
        String loginId,
        String password,
        String username
    ) {
        this.loginId = loginId;
        this.password = password;
        this.username = username;
    }

    public static ExternalAuthSignupRequestDto of(
        String loginId,
        String password,
        String username
    ) {
        return new ExternalAuthSignupRequestDto(
            loginId,
            password,
            username
        );
    }
}
