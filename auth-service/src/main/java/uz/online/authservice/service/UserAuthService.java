package uz.online.authservice.service;

import uz.online.authservice.dto.UserAuthDto;
import uz.online.authservice.dto.form.UserAuthForm;

import java.util.List;

public interface UserAuthService {
    UserAuthDto getOne(Integer id);
    List<UserAuthDto> list();
    UserAuthDto create(UserAuthForm form);
    UserAuthDto update(Integer id, UserAuthForm form);
    void delete(Integer id);
}
