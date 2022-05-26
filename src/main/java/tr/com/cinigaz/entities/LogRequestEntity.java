package tr.com.cinigaz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="logrequest")
@Entity
public class LogRequestEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_logrequest")
    @SequenceGenerator(name = "gen_logrequest", allocationSize = 1, sequenceName = "seq_logrequest")
    @Column(name = "logrequestid")
    private long logRuquestId;

    @Column(name = "tesisatkod", length = 50)
    private String tesisatKod;


    @Column(name = "islemguid", length = 50)
    private String islemGuid;

    @Column(name = "tutar", length = 50)
    private String tutar;


    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;



}
