package com.gundam.junk.domain.user.application.mapper;

import com.gundam.junk.domain.user.application.dto.interanl.request.InternalUserSignupRequestDto;
import com.gundam.junk.domain.user.application.dto.interanl.response.InternalUserSignupResponseDto;
import com.gundam.junk.domain.user.domain.model.User;

public class UserMapper {


    public static User internalSignupToEntityReq(InternalUserSignupRequestDto requestDto) {
        return User.of(
            requestDto.getLoginId(),
            requestDto.getPassword(),
            requestDto.getUsername()
        );
    }

    public static InternalUserSignupResponseDto internalEntityToSignupRes(User user) {
        return InternalUserSignupResponseDto.of(
            user.getLoginId(),
            user.getUsername(),
            user.getUserRole()
        );
    }
}
