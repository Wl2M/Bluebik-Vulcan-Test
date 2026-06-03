package InternTest.BlueBikTest.interfaces;

import InternTest.BlueBikTest.Controllers.dto.PaymentDto;
import InternTest.BlueBikTest.entity.Payments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IPaymentService {

    Payments getCustomerName(String customerName);
    Page<PaymentDto> getPayments (Pageable pageable);

}
