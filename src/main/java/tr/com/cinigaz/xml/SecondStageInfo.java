package tr.com.cinigaz.xml;


import tr.com.cinigaz.entities.IslemTuru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "tesisatKod",
        "islemGuid",
        "islemTuru",
        "islemTutari"
})

public class SecondStageInfo {


    @XmlElement(required = true)
    protected String tesisatKod;

    @XmlElement(required = true)
    protected String islemGuid;

    @XmlElement(required = true)
    protected String islemTutari;


    @XmlElement(required = true)
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
