package tr.com.cinigaz.dto;

import lombok.*;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class LogResponseDto {

    private String tesisatKod;
    private String islemGuid;
    private String islemTutari;
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    private String islemTuru;
}
