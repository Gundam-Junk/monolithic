package com.gundam.junk.domain.user.infrastructure.repository;

import com.gundam.junk.domain.user.domain.repository.UserRepository;
import com.gundam.junk.domain.user.infrastructure.persistence.JpaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;
}
