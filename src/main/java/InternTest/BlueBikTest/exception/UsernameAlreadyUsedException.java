package InternTest.BlueBikTest.exception;

public class UsernameAlreadyUsedException extends ValidationException{
    public UsernameAlreadyUsedException() {
        super("username already used");
    }
}
