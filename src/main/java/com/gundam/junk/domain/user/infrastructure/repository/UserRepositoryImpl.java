package com.gundam.junk.domain.user.infrastructure.repository;

import com.gundam.junk.domain.user.domain.exception.UserNotFoundException;
import com.gundam.junk.domain.user.domain.model.User;
import com.gundam.junk.domain.user.domain.repository.UserRepository;
import com.gundam.junk.domain.user.infrastructure.persistence.JpaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    @Override
    public User findById(Long userId) {
        return jpaUserRepository.findById(userId)
            .orElseThrow(() -> new UserNotFoundException(userId));
    }

    @Override
    public boolean existsByLoginId(String loginId) {
        return jpaUserRepository.existsByLoginId(loginId);
    }

    @Override
    public boolean existsByUsername(String username) {
        return jpaUserRepository.existsByUsername(username);
    }

    @Override
    public void save(User user) {
        jpaUserRepository.save(user);
    }
}
