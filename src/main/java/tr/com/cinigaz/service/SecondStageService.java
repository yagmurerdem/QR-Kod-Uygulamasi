package tr.com.cinigaz.service;

import tr.com.cinigaz.entities.SecondStageEntity;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;




@WebService(serviceName = "SecondStageService")
public interface SecondStageService {
    @WebMethod()
    @WebResult(name = "secondStageEntity")
    SecondStageEntity getSecondStage(String islemGuid, String tesisatKod);
}
