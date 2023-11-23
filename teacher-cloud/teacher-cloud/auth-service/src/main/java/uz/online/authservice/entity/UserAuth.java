package uz.online.authservice.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserAuth extends BaseEntity {
    private Integer userId;
    private Integer authorityId;
}
