package uz.online.authservice.exception;

import uz.online.authservice.enums.ErrorCode;

import static uz.online.authservice.enums.ErrorCode.ROLE_NOT_GIVEN;

public class RoleNotGivenException extends GeneralApiException{
    @Override
    ErrorCode errorCode() {
        return ROLE_NOT_GIVEN;
    }
}
