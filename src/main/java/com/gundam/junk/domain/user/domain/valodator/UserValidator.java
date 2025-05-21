package com.gundam.junk.domain.user.domain.valodator;

import com.gundam.junk.domain.user.domain.exception.LoginIdDuplicateException;
import com.gundam.junk.domain.user.domain.exception.UsernameDuplicateException;
import com.gundam.junk.domain.user.domain.model.User;
import com.gundam.junk.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserValidator {

    private final UserRepository userRepository;

    public void internalSignupValidate(User user) {
        if (userRepository.existsByLoginId(user.getLoginId())) {
            throw new LoginIdDuplicateException(user.getLoginId());
        }
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new UsernameDuplicateException(user.getUsername());
        }
    }
}
