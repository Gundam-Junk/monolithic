package com.gundam.junk.domain.auth.infrastructure.model;

public record UserInfo(
    Long id,
    String loginId,
    String password,
    String username,
    String userRole
) {
    public static UserInfo of(
        Long id,
        String loginId,
        String password,
        String username,
        String userRole
    ) {
        return new UserInfo(
            id,
            loginId,
            password,
            username,
            userRole
        );
    }
}
