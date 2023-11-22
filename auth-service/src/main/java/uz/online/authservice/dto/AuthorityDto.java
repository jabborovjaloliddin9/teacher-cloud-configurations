package uz.online.authservice.dto;

import lombok.*;
import uz.online.authservice.entity.Authority;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorityDto {
    private Integer id;
    private String authority;
    private String name;

    public static AuthorityDto toDto(Authority authority) {
        if(authority == null)
            return null;
        return AuthorityDto.builder()
                .id(authority.getId())
                .authority(authority.getAuthority())
                .name(authority.getName().locale())
                .build();
    }
}
