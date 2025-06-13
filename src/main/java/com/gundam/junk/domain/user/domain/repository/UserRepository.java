package com.gundam.junk.domain.user.domain.repository;

import com.gundam.junk.domain.user.domain.model.User;

public interface UserRepository {

    User findById(Long userId);

    boolean existsByLoginId(String loginId);

    boolean existsByUsername(String username);

    void save(User user);
}
