package uz.online.authservice.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "authorities")
public class Authority extends BaseEntity {
    @Column(length = 64, unique = true, nullable = false)
    private String authority;
    @Embedded
    private LocalizedString name;
}
