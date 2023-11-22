package uz.online.authservice.service;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.domain.Page;
import uz.online.authservice.dto.AuthorityDto;
import uz.online.authservice.dto.AuthorityGetAllDto;
import uz.online.authservice.dto.form.AuthorityForm;
import uz.online.libversion.dto.ResponseDto;


import java.text.ParseException;
import java.util.List;

public interface AuthorityService {

    ResponseDto<AuthorityDto> getOne(Integer id);
    ResponseDto<List<AuthorityGetAllDto>> getAll();
    ResponseDto<Page<AuthorityDto>> getList(Integer page, Integer size);

    ResponseDto<AuthorityDto> create(AuthorityForm form) throws ParseException;

    ResponseDto<AuthorityDto> update(Integer id, AuthorityForm form) throws ParseException;

    void delete(Integer id);

//    ResponseDto<TokenResponseDto> signIn(LoginForm form, HttpServletResponse response);
//
//    ResponseDto<TokenResponseDto> refreshToken(String refreshToken, HttpServletResponse response) throws Exception;
//
//    ResponseDto<String> sendEmailForResetPassword(String email, String sessionId);
//
//    ResponseDto<String> sendCode(String code, String sessionId);
//    ResponseDto<String> resetLoginPassword(LoginForm loginForm, String sessionId);

}
