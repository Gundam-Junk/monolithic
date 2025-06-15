package com.gundam.junk.domain.auth.application.service.impl;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.application.dto.external.response.ExternalAuthSignupResponseDto;
import com.gundam.junk.domain.auth.application.mapper.AuthMapper;
import com.gundam.junk.domain.auth.application.service.AuthService;
import com.gundam.junk.domain.auth.application.service.UserServicePort;
import com.gundam.junk.domain.auth.domain.model.UserInfo;
import com.gundam.junk.domain.auth.infrastructure.password.PasswordEncoderUtil;
import com.gundam.junk.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final UserServicePort userServicePort;

    @Override
    @Transactional
    public ExternalAuthSignupResponseDto signup(ExternalAuthSignupRequestDto requestDto) {
        String password = PasswordEncoderUtil.encode(requestDto.getPassword());
        UserInfo userInfo = userServicePort.registerUser(requestDto, password);
        return AuthMapper.toSignupRes(requestDto, password);
    }

}
