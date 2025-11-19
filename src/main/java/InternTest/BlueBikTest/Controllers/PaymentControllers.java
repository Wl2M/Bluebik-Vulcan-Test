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


//    @GetMapping(value = "/", params = "customerName")
//    public List<Payments> getByCustomerName(@RequestParam String customerName) {
//        return _paymentService.getCustomerName(customerName);
//    }

    @GetMapping("/")
    public Page<Payments> getPayments(
            @RequestParam (required = false) String customerName,
            @RequestParam(defaultValue = "date") String sortBy,   //date , amount
            @RequestParam(defaultValue = "asc") String order,     //asc ,desc
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int limit
    ) {

        Sort.Direction direction;
        if (order.equalsIgnoreCase("desc")) {
            direction = Sort.Direction.DESC;
        } else {
            direction = Sort.Direction.ASC;
        }

        Pageable pageable = PageRequest.of(page, limit, Sort.by(direction, sortBy));

        if(customerName != null && !customerName.isEmpty()   ){
            return _paymentService.searchByCustomerName(customerName,pageable);
        }



        return _paymentService.getPayments(pageable);


    }

}





