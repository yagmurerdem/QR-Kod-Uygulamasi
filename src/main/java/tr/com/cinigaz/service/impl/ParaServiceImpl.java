package tr.com.cinigaz.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.dto.LogResponseDto;
import tr.com.cinigaz.entities.KioskQrKodEntity;
import tr.com.cinigaz.exception.ParaNotFound;
import tr.com.cinigaz.repository.QrKodRepository;
import tr.com.cinigaz.service.ParaService;

@Service
@Configuration
public class ParaServiceImpl implements ParaService {

    private QrKodRepository qrKodRepository;
    private ModelMapper modelMapper;


    public ParaServiceImpl(QrKodRepository qrKodRepository, ModelMapper modelMapper) {
        this.qrKodRepository = qrKodRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public LogResponseDto paraGetId(Long kioskQrKodId) {
        KioskQrKodEntity paraentity = this.qrKodRepository.findKioskQrKodBykioskQrKodId(kioskQrKodId);
        if (paraentity!=null) {
            return modelMapper.map(paraentity, LogResponseDto.class);
        }
        throw new ParaNotFound("Veri Bulunamadı");


    }

}
