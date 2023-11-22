package uz.online.userservice.exception;

import lombok.*;
import uz.online.userservice.enums.ErrorCode;

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
