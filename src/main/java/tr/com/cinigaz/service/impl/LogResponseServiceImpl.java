package tr.com.cinigaz.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.dto.LogResponseDto;
import tr.com.cinigaz.entities.LogResponseEntity;
import tr.com.cinigaz.repository.LogResponseRepository;
import tr.com.cinigaz.result.ErrorResult;
import tr.com.cinigaz.result.Result;
import tr.com.cinigaz.result.SuccessResult;
import tr.com.cinigaz.service.LogResponseService;

import java.util.Date;

@Service
@Configuration


public class LogResponseServiceImpl implements LogResponseService {
    @Autowired
    private LogResponseRepository logResponseRepository;

    private ModelMapper modelMapper;


    public LogResponseServiceImpl(LogResponseRepository logResponseRepository, ModelMapper modelMapper) {
        this.logResponseRepository = logResponseRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result responseSave(LogResponseDto logResponseDto) {
        LogResponseEntity logResponseEntity = modelMapper.map(logResponseDto, LogResponseEntity.class);
        logResponseEntity.setTarih(new Date());
        LogResponseEntity logResponseEntity1 = new LogResponseEntity();
        logResponseEntity1 = logResponseRepository.save(logResponseEntity);
        if (logResponseEntity1 != null) {
            return new SuccessResult("Veri Eklendi");
        } else {
            ErrorResult errorResult = new ErrorResult("Veri Ekleme İşlemi Başarısız");
            return errorResult;
        }

        // else return  errorResult("Veri Ekleme İşlemi Başarısız");
//        if (logResponseDto.equals(logResponseDto)) {
//            return logResponseDto;
//
//        } else {
//            return new LogResponseDto();
//        }
    }
}
