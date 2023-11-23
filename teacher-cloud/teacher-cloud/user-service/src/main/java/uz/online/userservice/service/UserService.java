package uz.online.userservice.service;

import org.springframework.data.domain.Page;
import uz.online.libversion.dto.ResponseDto;
import uz.online.libversion.dto.UserDto;
import uz.online.userservice.dto.form.UserForm;

import java.text.ParseException;

public interface UserService {

    ResponseDto<UserDto> getOne(Integer id);
    ResponseDto<Page<UserDto>> getList(Integer page, Integer size);
    ResponseDto<UserDto> create(UserForm form) throws ParseException;
    ResponseDto<UserDto> update(Integer id, UserForm form) throws ParseException;
    void delete(Integer id);
}
