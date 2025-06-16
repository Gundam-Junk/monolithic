package com.gundam.junk.domain.auth.application.mapper;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.application.dto.external.response.ExternalAuthSignupResponseDto;

public class AuthMapper {

    public static ExternalAuthSignupResponseDto toSignupRes(ExternalAuthSignupRequestDto requestDto,
        String password) {
        return ExternalAuthSignupResponseDto.of(
            requestDto.getLoginId(),
            requestDto.getUsername(),
            "USER"
        );
    }
}
