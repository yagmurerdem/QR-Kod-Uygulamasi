package tr.com.cinigaz.service;

import tr.com.cinigaz.entities.KioskQrKodEntity;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(serviceName = "QrKodService")
public interface QrKodService {

    @WebMethod()
    @WebResult(name = "KioskQrKodEntity")
    KioskQrKodEntity getKioskQrKod(long kioskQrKodId);

    @WebMethod()
    @WebResult(name = "KioskQrKodEntity")
    KioskQrKodEntity getByTesisatKodAndIslemGuid(String tesisatKod, String islemGuid);



}
