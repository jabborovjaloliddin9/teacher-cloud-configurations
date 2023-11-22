package uz.online.authservice.exception;

import lombok.*;
import uz.online.authservice.enums.ErrorCode;

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
