package com.gundam.junk.domain.user.domain.exception;

import common.non_jpa.exception.BusinessException;
import common.non_jpa.exception.ErrorCode;

public class UserNotFoundException extends BusinessException {

    public UserNotFoundException(Long userId) {
        super(ErrorCode.RESOURCES_NOT_FOUND, "해당 사용자를 찾을 수 없습니다. userId : " + userId);
    }
}
