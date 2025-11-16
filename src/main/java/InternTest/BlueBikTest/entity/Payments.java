package InternTest.BlueBikTest.entity;


import InternTest.BlueBikTest.entity.Enum.E_Type;
import InternTest.BlueBikTest.entity.Enum.E_Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Payment")
public class Payments {

    @Id
    @Column(name = "id")
    public  String paymentID;

    @Column(name="date")
    public Timestamp date;

    @Column(name="type")
    public E_Type type;

    @Column(name="amount")
    public Double amount;

    @Column(name="customer_name")
    public String customerName;

    @Column(name="status")
    public E_Status status;

    @Lob
    @Column(name = "description", columnDefinition = "TEXT")
    public String describe;
}
