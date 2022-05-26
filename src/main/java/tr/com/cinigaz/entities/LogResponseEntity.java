package tr.com.cinigaz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="logresponse")
@Entity
public class LogResponseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_logresponse")
    @SequenceGenerator(name = "gen_logresponse", allocationSize = 1, sequenceName = "seq_logresponse")
    @Column(name = "logresponseid")
    private long logResponseId;

    @Column(name = "tesisatkod", length = 50)
    private String tesisatKod;


    @Column(name = "islemguid", length = 50)
    private String islemGuid;

    @Column(name = "tutar", length = 50)
    private String islemTutari;


    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;


    @Column(name = "islemturu", length = 50)
    private String islemTuru;

}




