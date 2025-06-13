package com.gundam.junk.domain.user.domain.exception;

import common.non_jpa.exception.BusinessException;
import common.non_jpa.exception.ErrorCode;

public class LoginIdDuplicateException extends BusinessException {

    public LoginIdDuplicateException(String loginId) {
        super(ErrorCode.DUPLICATE_RESOURCE, "로그인 아이디가 중복되었습니다.");
    }

}
