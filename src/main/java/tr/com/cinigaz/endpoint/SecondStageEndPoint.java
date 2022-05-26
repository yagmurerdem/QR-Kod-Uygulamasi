package tr.com.cinigaz.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tr.com.cinigaz.service.QrKodService;
import tr.com.cinigaz.xml.SecondStageInfo;
import tr.com.cinigaz.xml.SecondStageRequest;
import tr.com.cinigaz.xml.SecondStageResponse;

@Endpoint
public class SecondStageEndPoint {

    private static final String NAMESPACE_URI = "http://xml.cinigaz.com.tr";


    @Autowired
    private QrKodService qrKodService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "secondStageRequest")
    @ResponsePayload
    public SecondStageResponse getSecondStage(@RequestPayload SecondStageRequest secondStageRequest) {
        // GetQrKodResponse response = new GetQrKodResponse();
        SecondStageResponse secondStageResponse = new SecondStageResponse();

        SecondStageInfo secondStageInfo = new SecondStageInfo();
//        secondStageInfo.setMesaj(true);
//        secondStageInfo.setMesajKodu(1);
        BeanUtils.copyProperties(qrKodService.getByTesisatKodAndIslemGuid(secondStageRequest.getTesisatKod(), secondStageRequest.getIslemGuid()), secondStageInfo);
        secondStageResponse.setSecondStageInfo(secondStageInfo);
        // return response;
        return secondStageResponse;
    }
}
