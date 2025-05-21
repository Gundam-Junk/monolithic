package com.gundam.junk.domain.user.application.dto.interanl.response;

import com.gundam.junk.domain.user.domain.model.UserRole;
import lombok.Getter;

@Getter
public class InternalUserSignupResponseDto {

    private final String loginId;
    private final String username;
    private final UserRole role;

    private InternalUserSignupResponseDto(
        String loginId,
        String username,
        UserRole role
    ) {
        this.loginId = loginId;
        this.username = username;
        this.role = role;
    }

    public static InternalUserSignupResponseDto of(
        String loginId,
        String username,
        UserRole role
    ) {
        return new InternalUserSignupResponseDto(
            loginId,
            username,
            role
        );
    }

}
