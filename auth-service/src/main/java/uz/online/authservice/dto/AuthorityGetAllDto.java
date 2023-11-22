package uz.online.authservice.dto;

import lombok.*;
import uz.online.authservice.entity.Authority;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorityGetAllDto {
    private Integer id;
    private String authority;
    private String name;

    public static AuthorityGetAllDto toDto(Authority authority) {
        if(authority == null)
            return null;
        return AuthorityGetAllDto.builder()
                .id(authority.getId())
                .authority(authority.getAuthority())
                .name(authority.getName().locale())
                .build();
    }
}
