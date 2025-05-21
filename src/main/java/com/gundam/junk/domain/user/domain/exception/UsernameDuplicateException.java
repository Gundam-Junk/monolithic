package com.gundam.junk.domain.user.domain.exception;

import common.non_jpa.exception.BusinessException;
import common.non_jpa.exception.ErrorCode;

public class UsernameDuplicateException extends BusinessException {

    public UsernameDuplicateException(String username) {
        super(ErrorCode.DUPLICATE_RESOURCE, "사용자명이 중복되었습니다.");
    }

}
