package uz.online.userservice.exception;

import uz.online.userservice.enums.ErrorCode;

import static uz.online.userservice.enums.ErrorCode.ROLE_NOT_GIVEN;

public class RoleNotGivenException extends GeneralApiException{
    @Override
    ErrorCode errorCode() {
        return ROLE_NOT_GIVEN;
    }
}
