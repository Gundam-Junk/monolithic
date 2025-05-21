package com.gundam.junk.domain.user.application.service;

import com.gundam.junk.domain.user.application.dto.interanl.request.InternalUserSignupRequestDto;
import com.gundam.junk.domain.user.application.dto.interanl.response.InternalUserSignupResponseDto;

public interface UserService {

    InternalUserSignupResponseDto signup(InternalUserSignupRequestDto requestDto);
}
