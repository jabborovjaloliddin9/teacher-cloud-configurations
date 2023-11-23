package uz.online.userservice.mapper;

import org.springframework.security.crypto.password.PasswordEncoder;
import uz.online.libversion.constant.DateTimeConstant;
import uz.online.libversion.dto.UserDto;
import uz.online.libversion.utils.DateTimeUtils;
import uz.online.userservice.dto.form.UserForm;
import uz.online.userservice.entity.User;

import java.text.ParseException;

import static uz.online.libversion.constant.DateTimeConstant.toDateFormat;

public class UserMapper {

    public static UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .secondName(user.getSecondName())
                .fullName(user.getFullName())
                .birthDate(DateTimeUtils.fromDateToString(DateTimeConstant.toStringFormat, user.getBirthDate()))
                .documentSerial(user.getDocumentSerial())
                .documentNumber(user.getDocumentNumber())
                .pinfl(user.getPinfl())
                .phone(user.getPhone())
                .email(user.getEmail())
                .build();
    }

    public static User toEntity(UserForm form, PasswordEncoder passwordEncoder) throws ParseException {
        User user = new User();
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setSecondName(form.getSecondName());
        user.setFullName(form.getFirstName() + " " + form.getLastName() + " " + form.getSecondName());
        user.setBirthDate(DateTimeUtils.toDate(toDateFormat, form.getBirthDate()));
        user.setGenderId(form.getGenderId());
        user.setDocumentNumber(form.getDocumentNumber());
        user.setDocumentSerial(form.getDocumentSerial());
        user.setUsername(form.getUsername());
        user.setPassword(passwordEncoder.encode(form.getPassword()));
        user.setPhone(form.getPhone());
        user.setEmail(form.getEmail());
        user.setPinfl(form.getPinfl());
        return user;
    }
}
