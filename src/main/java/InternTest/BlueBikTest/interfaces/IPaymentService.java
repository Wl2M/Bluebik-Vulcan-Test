package InternTest.BlueBikTest.interfaces;

import InternTest.BlueBikTest.entity.Payments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IPaymentService {


    Page<Payments> getPayments (Pageable pageable);
    Page<Payments> searchByCustomerName(String customerName,Pageable pageable);

}
