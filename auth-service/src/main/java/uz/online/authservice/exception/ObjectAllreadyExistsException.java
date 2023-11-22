package uz.online.authservice.exception;

import lombok.*;
import uz.online.authservice.enums.ErrorCode;

import static uz.online.authservice.enums.ErrorCode.OBJECT_ALLREADY_EXISTS;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ObjectAllreadyExistsException extends GeneralApiException {
    private String field;
    private String objectName;
    @Override
    ErrorCode errorCode() {
        return OBJECT_ALLREADY_EXISTS;
    }
}
