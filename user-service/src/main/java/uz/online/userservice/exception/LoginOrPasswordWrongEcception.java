package uz.online.userservice.exception;

import uz.online.userservice.enums.ErrorCode;

import static uz.online.userservice.enums.ErrorCode.LOGIN_OR_PASSWORD_WRONG;

public class LoginOrPasswordWrongEcception extends GeneralApiException{
    @Override
    ErrorCode errorCode() {
        return LOGIN_OR_PASSWORD_WRONG;
    }
}
