package uz.online.authservice.exception;

import lombok.*;
import uz.online.authservice.enums.ErrorCode;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserNotFoundException extends GeneralApiException{
    private Integer id;
    @Override
    ErrorCode errorCode() {
        return ErrorCode.USER_NOT_FOUND;
    }
}
