package uz.online.userservice.exception;

import lombok.*;
import uz.online.userservice.enums.ErrorCode;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserNotFoundException extends GeneralApiException{
    private Integer id;
    @Override
    ErrorCode errorCode() {
        return ErrorCode.User_NOT_FOUND;
    }
}
