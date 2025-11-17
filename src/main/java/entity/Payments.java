package entity;


import entity.Enum.E_Status;
import entity.Enum.E_Type;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.w3c.dom.Text;

import java.sql.Timestamp;

@Entity
@Table (name="Payment")
public class Payments {

    @Id
    @Column(name = "id")
    private String paymentID;

    @Column(name="date")
    private Timestamp date;

    @Column(name="type")
    private E_Type type;

    @Column(name="amount")
    private Integer amount;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "status")
    private E_Status status;

    @Column(name="description")
    private Text description;






}
