package InternTest.BlueBikTest.Controllers.dto;


import lombok.*;

@Getter
@Setter
@Data
@Builder
public class ApiResponse {
    private Integer status;
    private String message;
}
