package uz.online.authservice.exception;

import uz.online.authservice.enums.ErrorCode;

import static uz.online.authservice.enums.ErrorCode.LOGIN_OR_PASSWORD_WRONG;

public class LoginOrPasswordWrongEcception extends GeneralApiException{
    @Override
    ErrorCode errorCode() {
        return LOGIN_OR_PASSWORD_WRONG;
    }
}
