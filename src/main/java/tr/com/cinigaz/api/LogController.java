
//Log kayıtlarının tutulduğu rest servistir.

package tr.com.cinigaz.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.cinigaz.dto.LogRequestDto;
import tr.com.cinigaz.dto.LogResponseDto;
import tr.com.cinigaz.service.LogRequestService;
import tr.com.cinigaz.service.LogResponseService;

@RestController
@RequestMapping(value = "/log")

public class LogController {
    @Autowired
    private LogRequestService logRequestService;

    @Autowired
    private LogResponseService logResponseService;


    @Autowired
    public LogController(LogRequestService logRequestService, LogResponseService logResponseService) {
        this.logRequestService = logRequestService;
        this.logResponseService = logResponseService;
    }


    @PostMapping(value="/logrequestadd")
    public ResponseEntity<?> logRequestSave(@RequestBody LogRequestDto logRequestDto){
        return ResponseEntity.ok(logRequestService.requestSave(logRequestDto));
    }

    @PostMapping(value="/responseadd")
    public ResponseEntity<?> logResponseSave(@RequestBody LogResponseDto logResponseDto){
        return ResponseEntity.ok(logResponseService.responseSave(logResponseDto));
    }

}
