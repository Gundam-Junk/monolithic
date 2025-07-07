package com.gundam.junk.domain.auth.application.service.impl;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.application.mapper.PortMapper;
import com.gundam.junk.domain.auth.application.service.UserServicePort;
import com.gundam.junk.domain.auth.domain.model.UserInfo;
import com.gundam.junk.domain.user.application.dto.interanl.request.InternalUserSignupRequestDto;
import com.gundam.junk.domain.user.application.dto.interanl.response.InternalUserSignupResponseDto;
import com.gundam.junk.domain.user.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServicePortImpl implements UserServicePort {

    private final UserService userService;

    @Override
    public UserInfo registerUser(ExternalAuthSignupRequestDto requestDto, String password) {
        InternalUserSignupRequestDto req = PortMapper.toUserRegisterDto(requestDto, password);
        InternalUserSignupResponseDto responseDto = userService.signup(req);
        return PortMapper.toUserInfo(responseDto);
    }
}
