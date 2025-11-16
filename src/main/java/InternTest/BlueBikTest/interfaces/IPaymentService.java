package InternTest.BlueBikTest.interfaces;

import InternTest.BlueBikTest.entity.Payments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IPaymentService {

    Payments getCustomerName(String customerName);
    Page<Payments> getPayments (Pageable pageable);

}
