package com.gundam.junk.domain.auth.application.service;

import com.gundam.junk.domain.auth.application.dto.external.request.ExternalAuthSignupRequestDto;
import com.gundam.junk.domain.auth.domain.model.UserInfo;

public interface UserServicePort {

    UserInfo registerUser(ExternalAuthSignupRequestDto requestDto, String password);

}
