package InternTest.BlueBikTest.services;


import InternTest.BlueBikTest.Controllers.dto.CreateUserRequest;
import InternTest.BlueBikTest.Controllers.dto.UserDataDto;
import InternTest.BlueBikTest.entity.Enum.E_Role;
import InternTest.BlueBikTest.entity.Users;
import InternTest.BlueBikTest.exception.EmailAlreadyUsedException;
import InternTest.BlueBikTest.exception.UsernameAlreadyUsedException;
import InternTest.BlueBikTest.exception.UsernameNotFound;
import InternTest.BlueBikTest.interfaces.IUserService;
import InternTest.BlueBikTest.repositories.UserRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServices implements IUserService {
    private final UserRepositories _userRepositories;
    private final BCryptPasswordEncoder _passwordEncoder;

    public UserServices(UserRepositories _userRepositories, BCryptPasswordEncoder _passwordEncoder){
        this._userRepositories = _userRepositories;
        this._passwordEncoder = _passwordEncoder;
    }

    @Override
    public UserDataDto getUsername(String username){
        Users users = _userRepositories.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFound());

        UserDataDto userDataDto = new UserDataDto();
        userDataDto.setUsername(users.getUsername());
        userDataDto.setEmail(users.getEmail());
        userDataDto.setRole(users.getRole());
        return userDataDto;
    }



    //Create user
    public void createUser(CreateUserRequest user){
        if(_userRepositories.existsByUsername(user.getUsername())){
            throw new UsernameAlreadyUsedException();
        }
        if(_userRepositories.existsByEmail(user.getEmail())){
            throw new EmailAlreadyUsedException();
        }

        Users newUser  = new Users();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(_passwordEncoder.encode(user.getPassword()));
        newUser.setEmail(user.getEmail());
        newUser.setRole(E_Role.USER);

        _userRepositories.save(newUser);
    }



}
