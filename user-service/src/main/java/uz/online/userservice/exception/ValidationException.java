package uz.online.userservice.exception;

import lombok.*;
import uz.online.userservice.enums.ErrorCode;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidationException extends GeneralApiException{
    private String field;
    private String rejectedValue;
    @Override
    ErrorCode errorCode() {
        return null;
    }
}
