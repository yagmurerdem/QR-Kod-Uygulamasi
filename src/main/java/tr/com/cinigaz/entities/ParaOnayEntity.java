package tr.com.cinigaz.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="paraonay")
@Entity
public class ParaOnayEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_paraonay")
    @SequenceGenerator(name = "gen_paraonay", allocationSize = 1, sequenceName = "seq_paraonay")

    @Column(name = "paraonayid")
    private long paraOnayId;

    @Column(name = "mesaj", length = 50)
    private boolean mesaj;
}
