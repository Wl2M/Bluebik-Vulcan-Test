package InternTest.BlueBikTest.Component;


import InternTest.BlueBikTest.Controllers.dto.PaymentDto;
import InternTest.BlueBikTest.entity.Payments;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public static PaymentDto toDto(Payments payments){
        return new PaymentDto(
                payments.getCustomerName(),
                payments.getAmount(),
                payments.getDate(),
                payments.getType(),
                payments.getStatus(),
                payments.getDescribe()
        );


    }
}
