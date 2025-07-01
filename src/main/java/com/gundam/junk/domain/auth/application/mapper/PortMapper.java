package com.gundam.junk.domain.auth.application.mapper;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.domain.model.UserInfo;
import com.gundam.junk.domain.user.application.dto.interanl.request.InternalUserSignupRequestDto;
import com.gundam.junk.domain.user.application.dto.interanl.response.InternalUserSignupResponseDto;

public class PortMapper {


    public static InternalUserSignupRequestDto toUserRegisterDto(
        ExternalAuthSignupRequestDto requestDto, String password) {
        return InternalUserSignupRequestDto.of(
            requestDto.getLoginId(),
            requestDto.getUsername(),
            password
        );
    }

    public static UserInfo toUserInfo(InternalUserSignupResponseDto responseDto) {
        return UserInfo.of(
            responseDto.getUserId(),
            responseDto.getLoginId(),
            responseDto.getPassword(),
            responseDto.getUsername(),
            responseDto.getRole().toString()
        );
    }
}
