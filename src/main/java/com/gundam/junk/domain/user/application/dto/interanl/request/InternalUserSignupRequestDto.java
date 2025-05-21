package com.gundam.junk.domain.user.application.dto.interanl.request;

import com.gundam.junk.domain.user.domain.model.UserRole;
import lombok.Getter;

@Getter
public class InternalUserSignupRequestDto {

    private final String loginId;
    private final String username;
    private final String password;
    private final UserRole role;

    private InternalUserSignupRequestDto(
        String loginId,
        String username,
        String password,
        UserRole role
    ) {
        this.loginId = loginId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static InternalUserSignupRequestDto of(
        String loginId,
        String username,
        String password,
        UserRole role
    ) {
        return new InternalUserSignupRequestDto(
            loginId,
            username,
            password,
            role
        );
    }

}
