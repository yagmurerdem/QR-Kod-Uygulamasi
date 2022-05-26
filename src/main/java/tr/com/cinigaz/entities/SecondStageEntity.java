package tr.com.cinigaz.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="secondstage")
@Entity

public class SecondStageEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="gen_kioskqrkod2")
    @SequenceGenerator(name="gen_kioskqrkod2",allocationSize = 1, sequenceName = "seq_kioskqrkod2")
    @Column(name="kioskqrkodid")
    private long kioskQrKodId;

    @Column(name="tesisatkod",length = 50)
    private String tesisatKod;

    @Column(name = "islemguid", length = 50)
    private String islemGuid;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss"/*, timezone = "GMT+8"*/)
    @Column(name = "tarih")
    public Date sorguSaatTarih;


    @Column(name = "islemtutari", length = 50)
    private String islemTutari;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "islemturuid_id", referencedColumnName = "islemturuid")
    private IslemTuru islemTuru;

}
