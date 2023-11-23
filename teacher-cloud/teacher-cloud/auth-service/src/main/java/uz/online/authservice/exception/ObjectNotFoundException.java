package uz.online.authservice.exception;

import lombok.*;
import uz.online.authservice.enums.ErrorCode;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObjectNotFoundException extends GeneralApiException{
    private String id;
    private String objectName;

    @Override
    ErrorCode errorCode() {
        return ErrorCode.OBJECT_NOT_FOUND;
    }
}
