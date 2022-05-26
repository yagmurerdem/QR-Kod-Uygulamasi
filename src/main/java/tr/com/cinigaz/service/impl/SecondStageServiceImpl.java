package tr.com.cinigaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.entities.SecondStageEntity;
import tr.com.cinigaz.exception.DataNotFound;
import tr.com.cinigaz.repository.SecondStageRepostroy;
import tr.com.cinigaz.service.SecondStageService;


@Service
public class SecondStageServiceImpl implements SecondStageService {


    @Autowired
    SecondStageRepostroy secondStageRepostroy;

    @Override
    public SecondStageEntity getSecondStage(String islemGuid, String tesisatKod) {
        SecondStageEntity secondStageEntity = secondStageRepostroy.getByTesisatKodAndIslemGuid(tesisatKod, islemGuid);
        if (secondStageEntity != null)
            return secondStageEntity;
        else {
            throw new DataNotFound("Veri Bulunamadı");
        }
    }


}

