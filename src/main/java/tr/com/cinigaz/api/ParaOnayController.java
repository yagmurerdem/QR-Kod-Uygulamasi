
//Başka apiden bu apiye gelen olumlu cevabına göre soap servise olumlu yanıtının döndürüldüğü rest servistir.
package tr.com.cinigaz.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.cinigaz.dto.ParaOnayDto;
import tr.com.cinigaz.service.ParaOnayService;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/paraonay")
public class ParaOnayController {
    private ParaOnayService paraOnayService;

    @Autowired
    public ParaOnayController(ParaOnayService paraOnayService) {
        this.paraOnayService = paraOnayService;
    }

    @GetMapping(value="/getParaOnayById/{para_onay_id}")
    public ResponseEntity<ParaOnayDto> paraOnayGet(@PathVariable("para_onay_id") @Valid Long paraOnayId)
    {
        return ResponseEntity.ok(paraOnayService.paraOnayGet(paraOnayId));
    }

}
