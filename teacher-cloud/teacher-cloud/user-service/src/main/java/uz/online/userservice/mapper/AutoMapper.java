package uz.online.userservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.online.libversion.dto.UserDto;
import uz.online.userservice.dto.form.UserForm;
import uz.online.userservice.entity.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Mapper(componentModel = "spring", imports = {PasswordEncoder.class, SimpleDateFormat.class})
public abstract class AutoMapper {

//    @Autowired
//    protected @Qualifier(value = "passwordEncoder") PasswordEncoder passwordEncoder;

    @Mapping(target = "birthDate", expression = "java(new SimpleDateFormat( \"dd.MM.yyyy\").format(user.getBirthDate()))")
    public abstract UserDto toDto(User user) throws ParseException ;

    @Mapping(target = "birthDate", expression = "java(new SimpleDateFormat(\"yyyy-MM-dd ss:mm:hh\").parse(form.getBirthDate()))")
    @Mapping(target = "fullName", expression = "java(form.getFirstName() + \" \" + form.getLastName() + \" \" + form.getSecondName())")
//    @Mapping(target = "password", expression = "java(passwordEncoder.encode(form.getPassword()))")
    public abstract User toEntity(UserForm form) throws ParseException;
}
