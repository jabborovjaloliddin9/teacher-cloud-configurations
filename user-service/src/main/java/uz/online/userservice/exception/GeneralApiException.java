package uz.online.userservice.exception;

import lombok.Getter;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import uz.online.userservice.enums.ErrorCode;
import uz.online.libversion.dto.*;

@Getter
public abstract class GeneralApiException extends RuntimeException{
    abstract ErrorCode errorCode();

    public ErrorResponse response(MessageSource messageSource, Object ... args) {
        return ErrorResponse.of(
                errorCode().getCode(),
                messageSource.getMessage(errorCode().name(), args, LocaleContextHolder.getLocale())
        );
    }
}
