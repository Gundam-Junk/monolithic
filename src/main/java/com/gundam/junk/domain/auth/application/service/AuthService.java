package com.gundam.junk.domain.auth.application.service;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.application.dto.external.response.ExternalAuthSignupResponseDto;

public interface AuthService {

    ExternalAuthSignupResponseDto signup(ExternalAuthSignupRequestDto requestDto);

}
