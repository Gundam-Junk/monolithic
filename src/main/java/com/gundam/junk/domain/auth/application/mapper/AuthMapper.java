package com.gundam.junk.domain.auth.application.mapper;

import com.gundam.junk.domain.auth.application.dto.external.response.ExternalAuthSignupResponseDto;
import com.gundam.junk.domain.auth.domain.model.UserInfo;

public class AuthMapper {

    public static ExternalAuthSignupResponseDto toSignupRes(UserInfo userInfo) {
        return ExternalAuthSignupResponseDto.of(
            userInfo.loginId(),
            userInfo.username(),
            userInfo.userRole()
        );
    }
}
