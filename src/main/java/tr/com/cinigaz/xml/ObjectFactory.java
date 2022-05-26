package tr.com.cinigaz.xml;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }


    public QrKodInfo createQrKodInfo() {
        return new QrKodInfo();
    }

    public SecondStageInfo createSecondStageInfo() {
        return new SecondStageInfo();
    }

    public GetQrKodRequest createGetQrKodRequest() {
        return new GetQrKodRequest();
    }

    public SecondStageRequest createSecondStageRequest() {
        return new SecondStageRequest();
    }

    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    public ResponseSonuc createResponseSonuc() {
        return new ResponseSonuc();
    }


    public SecondStageResponse createSecondStageResponse() {
        return new SecondStageResponse();
    }


}
