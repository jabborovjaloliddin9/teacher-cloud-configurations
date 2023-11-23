package uz.online.userservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.online.userservice.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByIdAndDeletedFalse(Integer id);
    Page<User> findAllByDeletedFalse(Pageable pageable);
    boolean existsByPhoneAndDeletedFalse(String phone);
    boolean existsByEmailAndDeletedFalse(String email);
    boolean existsByUsernameAndDeletedFalse(String Username);
    boolean existsByDocumentSerialAndDocumentNumberAndDeletedFalse(String documentSerial, String documentNumber);
    Optional<User> findByEmailAndDeletedFalse(String email);
}
