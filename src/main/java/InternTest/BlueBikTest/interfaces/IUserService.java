package InternTest.BlueBikTest.interfaces;

import InternTest.BlueBikTest.Controllers.dto.UserDataDto;
import InternTest.BlueBikTest.entity.Users;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    UserDataDto getUsername(String username);
}
