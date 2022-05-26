

//Kiosktaki Qr Kod okutulduktan sonra Bankanın tesisat kod ve işlem guid ile sorduğuna karşılık oluşturulmuş soap servistir.

package tr.com.cinigaz.endpoint;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tr.com.cinigaz.service.QrKodService;
import tr.com.cinigaz.xml.GetQrKodRequest;
import tr.com.cinigaz.xml.QrKodInfo;
import tr.com.cinigaz.xml.ResponseSonuc;

@Endpoint

public class KioskQrKodEndPoint {
    private static final String NAMESPACE_URI= "http://xml.cinigaz.com.tr";


    @Autowired
    private QrKodService qrKodService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getQrKodRequest")
    @ResponsePayload
    public ResponseSonuc getKioskQrKod(@RequestPayload GetQrKodRequest request) {
       // GetQrKodResponse response = new GetQrKodResponse();
        ResponseSonuc responseSonuc=new ResponseSonuc();

        QrKodInfo qrkodInfo = new  QrKodInfo();
        qrkodInfo.setMesaj(true);
        qrkodInfo.setMesajKodu(1);
        BeanUtils.copyProperties(qrKodService.getByTesisatKodAndIslemGuid(request.getTesisatKod(),request.getIslemGuid()), qrkodInfo);
        responseSonuc.setQrKodInfo(qrkodInfo);
       // return response;
        return responseSonuc;
    }
}
