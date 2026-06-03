package InternTest.BlueBikTest.services;


import InternTest.BlueBikTest.Component.PaymentMapper;
import InternTest.BlueBikTest.Controllers.dto.PaymentDto;
import InternTest.BlueBikTest.entity.Payments;
import InternTest.BlueBikTest.interfaces.IPaymentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import InternTest.BlueBikTest.repositories.PaymentRepositories;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PaymentService implements IPaymentService {
    private final PaymentRepositories _paymentRepositories;

    public PaymentService(PaymentRepositories _paymentRepositories) {
        this._paymentRepositories = _paymentRepositories;
    }

    @Override
    @Transactional
    public Payments getCustomerName(String customerName) {
        return _paymentRepositories.findByCustomerName(customerName).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public Page<PaymentDto> getPayments(Pageable pageable) {
        Page<Payments> paymentsPage = _paymentRepositories.findAll(pageable);
        return _paymentRepositories.findAll(pageable).map(PaymentMapper::toDto);
    }


}
