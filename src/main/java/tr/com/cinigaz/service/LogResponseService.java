package tr.com.cinigaz.service;

import tr.com.cinigaz.dto.LogResponseDto;
import tr.com.cinigaz.result.Result;

public interface LogResponseService {
    Result responseSave(LogResponseDto logResponseDto);
}
