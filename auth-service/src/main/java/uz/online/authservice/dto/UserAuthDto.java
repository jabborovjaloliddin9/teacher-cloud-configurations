package uz.online.authservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthDto {
    private Integer id;
    private Integer userId;
    private Integer authorityId;
}
