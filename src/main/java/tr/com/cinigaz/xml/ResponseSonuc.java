package tr.com.cinigaz.xml;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"qrKodInfo"})
@XmlRootElement(name = "responseSonuc")

public class ResponseSonuc {


    @XmlElement(required = true)
    protected QrKodInfo qrKodInfo;
    public ResponseSonuc(QrKodInfo qrKodInfo) {

        this.qrKodInfo = qrKodInfo;
    }


    public QrKodInfo getQrKodInfo() {
        return qrKodInfo;
    }

    public void setQrKodInfo(QrKodInfo qrKodInfo) {
        this.qrKodInfo = qrKodInfo;
    }
}
