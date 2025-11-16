package InternTest.BlueBikTest.Controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PaymentDto {
    private String id;
    private String date;
    private String type;
    private Double amount;

    @JsonProperty("customer_name")
    private String customerName;

    private String status;
    private String description;
}
