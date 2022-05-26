package tr.com.cinigaz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="myUser")
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_user")
    @SequenceGenerator(name = "gen_user", allocationSize = 1, sequenceName = "seq_user")
    @Column(name = "userid")
    private long userId;

    @Column(name = "username", length = 50)
    private String userName;

    @Column(name = "password", length = 50)
    private String password;
}
