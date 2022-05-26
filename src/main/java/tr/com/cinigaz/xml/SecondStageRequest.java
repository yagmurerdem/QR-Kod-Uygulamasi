package tr.com.cinigaz.xml;


import tr.com.cinigaz.entities.IslemTuru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"tesisatKod", "islemGuid", "islemTutari", "islemTuru"})
@XmlRootElement(name = "secondStageRequest")


public class SecondStageRequest {


    protected String tesisatKod;
    protected String islemGuid;
    //  protected Date sorguSaatTarih;
    protected String islemTutari;
    protected IslemTuru islemTuru;

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
