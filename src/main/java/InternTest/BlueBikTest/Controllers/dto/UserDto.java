package InternTest.BlueBikTest.Controllers.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;


@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String email;

}
