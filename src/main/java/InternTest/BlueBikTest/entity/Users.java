package InternTest.BlueBikTest.entity;


import InternTest.BlueBikTest.entity.Enum.E_Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Users")
public class Users {


    @Id
    @Column(name="userID")
    @JsonProperty("user_id")
    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID userID;
    @Column(name="username")
    public String username;
    @Column(name="password")
    public String password;
    @Column(name="email")
    public String email;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    public E_Role role = E_Role.USER;



}
