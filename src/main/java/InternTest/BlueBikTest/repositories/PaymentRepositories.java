package InternTest.BlueBikTest.repositories;

import InternTest.BlueBikTest.entity.Payments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Repository
public interface PaymentRepositories extends JpaRepository<Payments,String> {
    //List<Payments> findByCustomerName(String customerName);
    Page<Payments> findAll(Pageable pageable);
    Page<Payments> findByCustomerNameContainingIgnoreCase(String customerName,Pageable pageable);
}
