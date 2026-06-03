package InternTest.BlueBikTest.Controllers;


import InternTest.BlueBikTest.Controllers.dto.ApiResponse;
import InternTest.BlueBikTest.Controllers.dto.CreateUserRequest;
import InternTest.BlueBikTest.Controllers.dto.UserDataDto;
import InternTest.BlueBikTest.services.UserServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class UserControllers {

    private final UserServices _userServices;

    public UserControllers(UserServices _userServices){
        this._userServices = _userServices;
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserDataDto> getUser(@PathVariable String username){
        return ResponseEntity.ok(_userServices.getUsername(username));
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createUser(@RequestBody CreateUserRequest body){
        _userServices.createUser(body);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        ApiResponse.builder()
                                .status(201)
                                .message("User Created Successfully")
                                .build()
                );

    }

}
