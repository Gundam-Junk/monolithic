package com.gundam.junk.domain.user.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    ADMIN("관리자"),
    USER("일반 사용자")
    ;

    private final String description;

}
