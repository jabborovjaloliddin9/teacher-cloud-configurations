package uz.online.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.online.authservice.entity.UserAuth;

public interface UserAuthRepository extends JpaRepository<UserAuth, Integer> {
}
