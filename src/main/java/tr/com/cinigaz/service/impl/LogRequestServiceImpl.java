package tr.com.cinigaz.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.dto.LogRequestDto;
import tr.com.cinigaz.entities.LogRequestEntity;
import tr.com.cinigaz.repository.LogRequestRepository;
import tr.com.cinigaz.result.ErrorResult;
import tr.com.cinigaz.result.Result;
import tr.com.cinigaz.result.SuccessResult;
import tr.com.cinigaz.service.LogRequestService;

import java.util.Date;


@Service
@Configuration


public class LogRequestServiceImpl implements LogRequestService {

    private LogRequestRepository logRequestRepository;
    private ModelMapper modelMapper;


    public LogRequestServiceImpl(LogRequestRepository logRequestRepository, ModelMapper modelMapper) {
        this.logRequestRepository = logRequestRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result requestSave(LogRequestDto logRequestDto) {
        LogRequestEntity logRequestEntity = modelMapper.map(logRequestDto, LogRequestEntity.class);
        LogRequestEntity logRequestEntity1 = new LogRequestEntity();
        logRequestEntity1 = logRequestRepository.save(logRequestEntity);
        logRequestEntity.setTarih(new Date());
        if (logRequestEntity1 != null) {
            return new SuccessResult("Veri Eklendi");
        } else {
            ErrorResult errorResult = new ErrorResult("Veri Ekleme İşlemi Başarısız");
            return errorResult;
        }
//        if( logRequestDto.equals(logRequestDto)){
//            return logRequestDto;
//        }
//        else
//        {
//            return new LogRequestDto();
//        }
    }
}
