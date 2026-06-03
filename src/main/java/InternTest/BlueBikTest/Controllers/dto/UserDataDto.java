package InternTest.BlueBikTest.Controllers.dto;

import InternTest.BlueBikTest.entity.Enum.E_Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDataDto {

    private String username;
    private String email;
    private E_Role role;

}
