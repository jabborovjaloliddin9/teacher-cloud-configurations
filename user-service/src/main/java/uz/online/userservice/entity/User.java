package uz.online.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Users")
public class User extends BaseEntity{
    @Column(length = 128)
    private String firstName;
    @Column(length = 128)
    private String lastName;
    @Column(length = 128)
    private String secondName;
    private String fullName;
    @Column(length = 128, unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(length = 32)
    private String phone;
    @Column(length = 128)
    private String email;
    private Date birthDate;
    @Column(length = 4)
    private String documentSerial;
    @Column(length = 16)
    private String documentNumber;
    @Column(length = 14)
    private String pinfl;
    private Integer genderId;
}
