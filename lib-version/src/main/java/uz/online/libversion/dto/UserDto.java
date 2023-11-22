package uz.online.libversion.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String fullName;
    private String birthDate;
    private String pinfl;
    private String documentSerial;
    private String documentNumber;
    private String phone;
    private String email;
    private String parentFullName;
    private String parentPhone;
}
