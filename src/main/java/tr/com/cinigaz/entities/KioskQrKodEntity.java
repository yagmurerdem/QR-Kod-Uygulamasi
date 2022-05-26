package tr.com.cinigaz.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "kioskqrkod")
@Entity

public class KioskQrKodEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_kioskqrkod")
    @SequenceGenerator(name = "gen_kioskqrkod", allocationSize = 1, sequenceName = "seq_kioskqrkod")
    @Column(name = "kioskqrkodid")
    private long kioskQrKodId;

    @Column(name = "tesisatkod", length = 50)
    private String tesisatKod;


    @Column(name = "islemguid", length = 50)
    private String islemGuid;

//    @Column(name="sorgulamatarihzaman")
//    @Temporal(TemporalType.TIMESTAMP)
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    private Date sorguSaatTarih;


    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss"/*, timezone = "GMT+8"*/)
    @Column(name = "tarih")
    public Date sorguSaatTarih;


    @Column(name = "islemtutari", length = 50)
    private String islemTutari;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "islemturuid_id", referencedColumnName = "islemturuid")
    private IslemTuru islemTuru;
}
