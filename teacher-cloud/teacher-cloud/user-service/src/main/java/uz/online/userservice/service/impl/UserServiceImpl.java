package uz.online.userservice.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.online.libversion.dto.ResponseDto;
import uz.online.libversion.dto.UserDto;
import uz.online.libversion.utils.DateTimeUtils;
import uz.online.userservice.dto.form.UserForm;
import uz.online.userservice.entity.User;
import uz.online.userservice.exception.ObjectAllreadyExistsException;
import uz.online.userservice.exception.UserNotFoundException;
import uz.online.userservice.mapper.UserMapper;
import uz.online.userservice.repository.UserRepository;
import uz.online.userservice.service.UserService;

import java.text.ParseException;

import static uz.online.libversion.constant.DateTimeConstant.toDateFormat;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public ResponseDto<UserDto> getOne(Integer id) {
        return ResponseDto.<UserDto>builder()
                .success(true)
                .data(UserMapper.toDto(get(id)))
                .build();
    }

    @Override
    public ResponseDto<Page<UserDto>> getList(Integer page, Integer size) {
        return ResponseDto.<Page<UserDto>>builder()
                .success(true)
                .data(repository.findAllByDeletedFalse(PageRequest.of(page, size)).map(UserMapper::toDto))
                .build();
    }

    @Override
    public ResponseDto<UserDto> create(UserForm form) throws ParseException {
        return ResponseDto.<UserDto>builder()
                .success(true)
                .data(UserMapper.toDto(repository.save(fill(new User(), form))))
                .build();
    }

    @Override
    public ResponseDto<UserDto> update(Integer id, UserForm form) throws ParseException {
        return ResponseDto.<UserDto>builder()
                .success(true)
                .data(UserMapper.toDto(repository.save(fill(get(id), form))))
                .build();
    }

    @Override
    public void delete(Integer id) {
        User user = get(id);
        user.setDeleted(true);
        repository.save(user);
    }

    public User fill(User User, UserForm form) throws ParseException {
        if (repository.existsByPhoneAndDeletedFalse(form.getPhone()))
            throw new ObjectAllreadyExistsException(form.getPhone(), "phone");
        if (repository.existsByEmailAndDeletedFalse(form.getEmail()))
            throw new ObjectAllreadyExistsException(form.getEmail(), "email");
        if (repository.existsByUsernameAndDeletedFalse(form.getUsername()))
            throw new ObjectAllreadyExistsException(form.getUsername(), "Username");
        if (repository.existsByDocumentSerialAndDocumentNumberAndDeletedFalse(form.getDocumentSerial(), form.getDocumentNumber()))
            throw new ObjectAllreadyExistsException(form.getDocumentSerial() + " " + form.getDocumentNumber(), "document");
        User.setFirstName(form.getFirstName());
        User.setLastName(form.getLastName());
        User.setSecondName(form.getSecondName());
        User.setFullName(form.getFirstName() + " " + form.getLastName() + " " + form.getSecondName());
        User.setBirthDate(DateTimeUtils.toDate(toDateFormat, form.getBirthDate()));
        User.setGenderId(form.getGenderId());
        User.setDocumentNumber(form.getDocumentNumber());
        User.setDocumentSerial(form.getDocumentSerial());
        User.setUsername(form.getUsername());
        User.setPassword(passwordEncoder.encode(form.getPassword()));
        User.setPhone(form.getPhone());
        User.setEmail(form.getEmail());
        User.setPinfl(form.getPinfl());
        return User;
    }

    public User get(Integer id) {
        return repository.findByIdAndDeletedFalse(id).orElseThrow(() -> new UserNotFoundException(id));
    }
}
