package com.gundam.junk.domain.auth.application.service.impl;

import com.gundam.junk.domain.auth.application.service.AuthService;
import com.gundam.junk.domain.user.application.service.UserService;
import com.gundam.junk.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;


}
