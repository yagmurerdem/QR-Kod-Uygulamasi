package tr.com.cinigaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.entities.KioskQrKodEntity;
import tr.com.cinigaz.exception.DataNotFound;
import tr.com.cinigaz.repository.QrKodRepository;
import tr.com.cinigaz.service.QrKodService;

@Service
public class QrKodServiceImpl implements QrKodService {

    @Autowired
    QrKodRepository qrKodRepository;


    @Override
    public KioskQrKodEntity getKioskQrKod(long kioskQrKodId) {
        KioskQrKodEntity kioskQrKod=qrKodRepository.findKioskQrKodBykioskQrKodId(kioskQrKodId);
        return kioskQrKod;
    }

    @Override
    public KioskQrKodEntity getByTesisatKodAndIslemGuid(String tesisatKod, String islemGuid) {

        KioskQrKodEntity kioskQrKod=qrKodRepository.getByTesisatKodAndIslemGuid(tesisatKod, islemGuid);
        if(kioskQrKod!=null) {
            return kioskQrKod;
        }
        else{
            throw new DataNotFound("Veri Bulunamadı");
        }
    }


}
