package InternTest.BlueBikTest.services;

import InternTest.BlueBikTest.entity.Payments;
import InternTest.BlueBikTest.interfaces.IPaymentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import InternTest.BlueBikTest.repositories.PaymentRepositories;
import org.springframework.transaction.annotation.Transactional;



@Transactional(readOnly = true)
@Service
public class PaymentService implements IPaymentService {
    private final PaymentRepositories _paymentRepositories;

    public PaymentService (PaymentRepositories _paymentRepositories){
        this._paymentRepositories = _paymentRepositories;
    }


    @Override
    public Page<Payments> getPayments(Pageable pageable) {
        return _paymentRepositories.findAll(pageable);
    }

    @Override
    public Page<Payments> searchByCustomerName(String customerName , Pageable pageable) {
        return _paymentRepositories.findByCustomerNameContainingIgnoreCase(customerName,pageable);
    }
}
