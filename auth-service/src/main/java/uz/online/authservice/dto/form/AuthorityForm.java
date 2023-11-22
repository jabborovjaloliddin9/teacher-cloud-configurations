package uz.online.authservice.dto.form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.online.authservice.entity.LocalizedString;

import static uz.online.libversion.constant.ValidationMessages.NOT_NULL_MESSAGE;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityForm {
    @NotBlank(message = NOT_NULL_MESSAGE)
    private String authority;
    private LocalizedString name;
}
