package tr.com.cinigaz.service;

import tr.com.cinigaz.dto.LogRequestDto;
import tr.com.cinigaz.result.Result;

public interface LogRequestService {
    Result requestSave(LogRequestDto logRequestDto);
}
