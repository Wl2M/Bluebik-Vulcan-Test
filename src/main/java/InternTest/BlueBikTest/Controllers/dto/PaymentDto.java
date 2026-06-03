package InternTest.BlueBikTest.Controllers.dto;

import InternTest.BlueBikTest.entity.Enum.E_Status;
import InternTest.BlueBikTest.entity.Enum.E_Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@JsonPropertyOrder({
        "id",
        "customer_name",
        "amount",
        "status",
        "type",
        "description",
        "date"
})
public class PaymentDto {
    private String id;
    private Timestamp date;
    private E_Type type;
    private Double amount;

    @JsonProperty("customer_name")
    private String customerName;

    private E_Status status;
    private String description;

    public PaymentDto(String customerName, Double amount, Timestamp date, E_Type type, E_Status status, String describe) {
        this.customerName = customerName;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.status = status;
        this.description = describe;
    }

}
