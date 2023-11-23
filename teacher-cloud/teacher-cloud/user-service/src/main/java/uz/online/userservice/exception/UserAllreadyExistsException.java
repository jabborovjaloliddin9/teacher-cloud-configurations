package uz.online.userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.online.userservice.enums.ErrorCode;

import static uz.online.userservice.enums.ErrorCode.User_ALLREADY_EXISTS;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAllreadyExistsException extends GeneralApiException {
    public String Username;

    @Override
    ErrorCode errorCode() {
        return User_ALLREADY_EXISTS;
    }
}
