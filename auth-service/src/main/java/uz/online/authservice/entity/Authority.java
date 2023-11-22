package uz.online.authservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
