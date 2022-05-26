package tr.com.cinigaz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="islemturu")
@Entity
public class IslemTuru {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_islemturu")
    @SequenceGenerator(name = "gen_islemturu", allocationSize = 1, sequenceName = "seq_islemturu")
    @Column(name = "islemturuid")
    private long islemTuruId;

    @Column(name = "islemturuadi", length = 50)
    private String islemTuruAdi;
}
