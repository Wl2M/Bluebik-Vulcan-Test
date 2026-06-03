package InternTest.BlueBikTest.Handler;


import InternTest.BlueBikTest.Controllers.dto.ApiResponse;
import InternTest.BlueBikTest.exception.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ApiResponse> handleValidation(
            ValidationException ex){

        return ResponseEntity.badRequest()
                .body(
                        ApiResponse.builder()
                                .status(400)
                                .message(ex.getMessage())
                                .build()
                );
    }
}