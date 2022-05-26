package tr.com.cinigaz.xml;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import tr.com.cinigaz.entities.IslemTuru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "kioskQrKodId",
        "tesisatKod",
        "islemGuid",
        "sorguSaatTarih",
        "islemTutari",
        "islemTuru",
        "mesaj",
        "mesajKodu"
})


public class QrKodInfo {


    protected long kioskQrKodId;

    @XmlElement(required = true)
    protected String tesisatKod;

    @XmlElement(required = true)
    protected String islemGuid;

    @XmlElement(required = true)
    protected Date sorguSaatTarih;

    @XmlElement(required = true)
    protected String islemTutari;

    @XmlElement(required = true)
    protected IslemTuru islemTuru;

    @XmlElement(required = true)
    protected boolean mesaj;

    @XmlElement(required = true)
    protected int mesajKodu;


    public Date getSorguSaatTarih() {
        return sorguSaatTarih;
    }

    public void setSorguSaatTarih(Date sorguSaatTarih) {
        this.sorguSaatTarih = sorguSaatTarih;
    }

    public long getKioskQrKodId() {
        return kioskQrKodId;
    }

    public void setKioskQrKodId(long kioskQrKodId) {
        this.kioskQrKodId = kioskQrKodId;
    }

    public String getTesisatKod() {
        return tesisatKod;
    }

    public void setTesisatKod(String tesisatKod) {
        this.tesisatKod = tesisatKod;
    }

    public String getIslemGuid() {
        return islemGuid;
    }

    public void setIslemGuid(String islemGuid) {
        this.islemGuid = islemGuid;
    }

    public boolean isMesaj() {
        return mesaj;
    }

    public void setMesaj(boolean mesaj) {
        this.mesaj = mesaj;
    }

    public int getMesajKodu() {
        return mesajKodu;
    }

    public void setMesajKodu(int mesajKodu) {
        this.mesajKodu = mesajKodu;
    }

    public String getIslemTutari() {
        return islemTutari;
    }

    public void setIslemTutari(String islemTutari) {
        this.islemTutari = islemTutari;
    }

    public IslemTuru getIslemTuru() {
        return islemTuru;
    }

    public void setIslemTuru(IslemTuru islemTuru) {
        this.islemTuru = islemTuru;
    }
}
