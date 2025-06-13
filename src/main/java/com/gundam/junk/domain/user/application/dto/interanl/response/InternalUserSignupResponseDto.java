package com.gundam.junk.domain.user.application.dto.interanl.response;

import com.gundam.junk.domain.user.domain.model.UserRole;
import lombok.Getter;

@Getter
public class InternalUserSignupResponseDto {

    private final Long userId;
    private final String loginId;
    private final String password;
    private final String username;
    private final UserRole role;

    private InternalUserSignupResponseDto(
        Long userId,
        String loginId,
        String password,
        String username,
        UserRole role
    ) {
        this.userId = userId;
        this.loginId = loginId;
        this.password = password;
        this.username = username;
        this.role = role;
    }

    public static InternalUserSignupResponseDto of(
        Long userId,
        String loginId,
        String password,
        String username,
        UserRole role
    ) {
        return new InternalUserSignupResponseDto(
            userId,
            loginId,
            password,
            username,
            role
        );
    }

}
