package com.gundam.junk.domain.user.application.service.impl;

import com.gundam.junk.domain.user.application.dto.interanl.request.InternalUserSignupRequestDto;
import com.gundam.junk.domain.user.application.dto.interanl.response.InternalUserSignupResponseDto;
import com.gundam.junk.domain.user.application.mapper.UserMapper;
import com.gundam.junk.domain.user.application.service.UserService;
import com.gundam.junk.domain.user.domain.model.User;
import com.gundam.junk.domain.user.domain.repository.UserRepository;
import com.gundam.junk.domain.user.domain.valodator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserValidator userValidator;

    @Override
    public InternalUserSignupResponseDto signup(InternalUserSignupRequestDto requestDto) {
        User user = UserMapper.internalSignupToEntityReq(requestDto);
        userValidator.internalSignupValidate(user);

        userRepository.save(user);
        return UserMapper.internalEntityToSignupRes(user);
    }

}
