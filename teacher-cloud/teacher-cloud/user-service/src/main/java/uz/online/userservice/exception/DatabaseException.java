package uz.online.userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.online.userservice.enums.ErrorCode;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseException extends GeneralApiException{
    private String message;

    @Override
    ErrorCode errorCode() {
        return ErrorCode.DATABASE_ERROR;
    }
}
