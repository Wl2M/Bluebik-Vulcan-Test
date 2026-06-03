package InternTest.BlueBikTest.exception;

public class EmailAlreadyUsedException extends ValidationException {
    public EmailAlreadyUsedException() {
        super("Email already used");
    }
}
