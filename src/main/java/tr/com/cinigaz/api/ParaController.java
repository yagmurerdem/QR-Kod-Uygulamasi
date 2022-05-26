
//Bankadan parayı bloke ettim yanıtı üzerine başka bir api ye vermek üzere oluşturulmuş rest sevistir.

package tr.com.cinigaz.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.cinigaz.dto.LogResponseDto;
import tr.com.cinigaz.service.ParaService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/parabloke")

public class ParaController {
    private ParaService paraService;

    @Autowired
    public ParaController(ParaService paraService) {
        this.paraService = paraService;
    }

    @GetMapping(value = "/getParaById/{para_id}")
    public ResponseEntity<LogResponseDto> paraGetId(@PathVariable("para_id") @Valid Long kioskQrKodId) {
        return ResponseEntity.ok(this.paraService.paraGetId(kioskQrKodId));

    }
}
