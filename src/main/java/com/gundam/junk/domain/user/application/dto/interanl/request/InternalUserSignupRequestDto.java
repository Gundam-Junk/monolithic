package com.gundam.junk.domain.user.application.dto.interanl.request;

import lombok.Getter;

@Getter
public class InternalUserSignupRequestDto {

    private final String loginId;
    private final String username;
    private final String password;

    private InternalUserSignupRequestDto(
        String loginId,
        String username,
        String password
    ) {
        this.loginId = loginId;
        this.username = username;
        this.password = password;
    }

    public static InternalUserSignupRequestDto of(
        String loginId,
        String username,
        String password
    ) {
        return new InternalUserSignupRequestDto(
            loginId,
            username,
            password
        );
    }

}
