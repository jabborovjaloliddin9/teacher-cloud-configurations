package uz.online.authservice.exception;

import lombok.*;
import uz.online.authservice.enums.ErrorCode;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityNotFoundException extends GeneralApiException{
    private Integer id;
    @Override
    ErrorCode errorCode() {
        return ErrorCode.AUTHORITY_NOT_FOUND;
    }
}
