package InternTest.BlueBikTest.repositories;

import InternTest.BlueBikTest.Controllers.dto.UserDataDto;
import InternTest.BlueBikTest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositories extends JpaRepository<Users, UUID> {
    Optional<Users> findByUsername(String username);


    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
