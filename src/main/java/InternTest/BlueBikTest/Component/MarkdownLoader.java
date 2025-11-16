//package InternTest.BlueBikTest.Component;
//
//import InternTest.BlueBikTest.entity.Payments;
//import InternTest.BlueBikTest.entity.Enum.E_Status;
//import InternTest.BlueBikTest.entity.Enum.E_Type;
//import InternTest.BlueBikTest.repositories.PaymentRepositories;
//import InternTest.BlueBikTest.Controllers.dto.PaymentDto;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Component;
//
//import java.nio.charset.StandardCharsets;
//import java.sql.Timestamp;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Component
//public class MarkdownLoader implements CommandLineRunner {
//
//    @Autowired
//    private PaymentRepositories paymentRepositories;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//        ClassPathResource resource = new ClassPathResource("data.md");
//        String json = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
//
//        ObjectMapper mapper = new ObjectMapper();
//
//
//        PaymentDto[] dtos = mapper.readValue(json, PaymentDto[].class);
//
//
//        for (PaymentDto dto : dtos) {
//            Payments p = new Payments();
//            p.setPaymentID(dto.getId());
//            LocalDate ld = LocalDate.parse(dto.getDate());
//            LocalDateTime ldt = ld.atStartOfDay();
//            p.setDate(Timestamp.valueOf(ldt));
//            p.setAmount(dto.getAmount());
//            p.setCustomerName(dto.getCustomerName());
//            p.setStatus(E_Status.valueOf(dto.getStatus().toLowerCase()));
//            p.setType(E_Type.valueOf(dto.getStatus().toLowerCase()));
//            p.setDescribe(dto.getDescription());
//
//
//            paymentRepositories.save(p);
//        }
//
//        System.out.println("Import data success");
//    }
//}
