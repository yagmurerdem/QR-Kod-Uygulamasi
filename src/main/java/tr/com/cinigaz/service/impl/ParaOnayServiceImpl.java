package tr.com.cinigaz.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.dto.ParaOnayDto;
import tr.com.cinigaz.entities.ParaOnayEntity;
import tr.com.cinigaz.exception.ParaNotFound;
import tr.com.cinigaz.repository.ParaOnayRepository;
import tr.com.cinigaz.service.ParaOnayService;

@Service

public class ParaOnayServiceImpl implements ParaOnayService {

    private ParaOnayRepository paraOnayRepository;
    private ModelMapper modelMapper;

    @Autowired
    public ParaOnayServiceImpl(ParaOnayRepository paraOnayRepository, ModelMapper modelMapper) {
        this.paraOnayRepository = paraOnayRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ParaOnayDto paraOnayGet(Long paraOnayId) {
        ParaOnayEntity paraonayentity =paraOnayRepository.findParaOnayEntityByparaOnayId(paraOnayId);
        if (paraonayentity!=null) {
            return modelMapper.map(paraonayentity, ParaOnayDto.class);
        }
        throw new ParaNotFound("Veri Bulunamadı");


    }

}