package InternTest.BlueBikTest.exception;

public class UsernameNotFound extends ValidationException {
    public UsernameNotFound() {
        super("Username not found");
    }
}
