package com.gundam.junk.domain.user.infrastructure.persistence;

import com.gundam.junk.domain.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {

    boolean existsByLoginId(String loginId);

    boolean existsByUsername(String username);
}
