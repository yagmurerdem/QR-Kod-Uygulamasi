package tr.com.cinigaz.xml;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"tesisatKod","islemGuid"})
@XmlRootElement(name = "getQrKodRequest")
public class GetQrKodRequest {

    //    protected long kioskQrKodId;
    protected String tesisatKod;
    protected String islemGuid;


    public String getIslemGuid() {
        return islemGuid;
    }

    public void setIslemGuid(String islemGuid) {
        this.islemGuid = islemGuid;
    }

    public String getTesisatKod() {
        return tesisatKod;
    }

    public void setTesisatKod(String tesisatKod) {
        this.tesisatKod = tesisatKod;
    }
}
