package uz.online.authservice.dto.form;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthForm {
    private Integer userId;
    private Integer authorityId;
}
