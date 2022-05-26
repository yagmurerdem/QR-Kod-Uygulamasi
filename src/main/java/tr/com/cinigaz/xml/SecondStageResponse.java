package tr.com.cinigaz.xml;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"secondStageInfo"})
@XmlRootElement(name = "secondStageResponse")

public class SecondStageResponse {


    @XmlElement(required = true)
    protected SecondStageInfo secondStageInfo;

    public SecondStageResponse(SecondStageInfo secondStageInfo) {

        this.secondStageInfo = secondStageInfo;
    }


    public SecondStageInfo getSecondStageInfo() {
        return secondStageInfo;
    }

    public void setSecondStageInfo(SecondStageInfo secondStageInfo) {
        this.secondStageInfo = secondStageInfo;
    }
}