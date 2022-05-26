package tr.com.cinigaz.dto;

import lombok.*;
import org.joda.time.DateTime;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class LogRequestDto {
    private String tesisatKod;
    private String islemGuid;
    private String tutar;
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
}
