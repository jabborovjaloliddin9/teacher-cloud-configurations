package uz.online.userservice.dto.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import static uz.online.libversion.constant.ValidationMessages.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {
    @NotBlank(message = NOT_NULL_MESSAGE)
    private String firstName;
    @NotBlank(message = NOT_NULL_MESSAGE)
    private String lastName;
    @NotBlank(message = NOT_NULL_MESSAGE)
    private String secondName;
    @NotBlank(message = NOT_NULL_MESSAGE)
    private String Username;
    @NotBlank(message = NOT_NULL_MESSAGE)
    private String password;
    @Pattern(regexp = "[0-9]{12}", message = PATTERN_NOT_VALID)
    private String phone;
    @Email(message = EMAIL_INCORRECT)
    private String email;
    @NotBlank(message = NOT_NULL_MESSAGE)
    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}", message = DATE_PATTERN_NOT_VALID)
    private String birthDate;
    @NotBlank(message = NOT_NULL_MESSAGE)
    @Pattern(regexp = "[A-Z]{2}", message = PATTERN_NOT_VALID)
    private String documentSerial;
    @NotBlank(message = NOT_NULL_MESSAGE)
    @Pattern(regexp = "[0-9]{7}", message = PATTERN_NOT_VALID)
    private String documentNumber;
    @Pattern(regexp = "[0-9]{14}", message = PATTERN_NOT_VALID)
    private String pinfl;
    private Integer genderId;
}
