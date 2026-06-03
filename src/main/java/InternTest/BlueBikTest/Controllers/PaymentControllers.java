package InternTest.BlueBikTest.Controllers;


import InternTest.BlueBikTest.entity.Payments;
import InternTest.BlueBikTest.interfaces.IPaymentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/transactions")
public class PaymentControllers {

    private final IPaymentService _paymentService;

    public PaymentControllers(IPaymentService _paymentService){
        this._paymentService = _paymentService;
    }


    @GetMapping(value = "/", params = "customerName")
    public Payments getByCustomerName(@RequestParam String customerName) {
        return _paymentService.getCustomerName(customerName);
    }

    @GetMapping("/")
    public Page<Payments> getPayments(
            @RequestParam(defaultValue = "date") String sortBy,   //date , amount
            @RequestParam(defaultValue = "asc") String order,     //asc ,desc
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int limit
    ) {
        Sort.Direction direction = order.equalsIgnoreCase("desc")
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        Pageable pageable = PageRequest.of(page, limit, Sort.by(direction, sortBy));

        return _paymentService.getPayments(pageable);
    }

//    @GetMapping("")
//    public Page<Payments> getPayments(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "10") int limit
//    ) {
//        Pageable pageable = PageRequest.of(page, limit);
//
//        return _paymentService.getPayments(pageable);
//    }



}





