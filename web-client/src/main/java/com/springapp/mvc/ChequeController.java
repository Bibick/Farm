package com.springapp.mvc;

import com.bibick.core.model.Cheque;
import com.bibick.core.service.ChequeService;
import com.bibick.dto.json.JsonBuilder;
import com.bibick.dto.json.JsonEntity;
import com.bibick.dto.model.ChequeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:18 PM
 */
@Controller
@RequestMapping("/cheque")
public class ChequeController {

    @Autowired
    private ChequeService chequeService;

    @RequestMapping("/add")
    public void addCheque(Cheque cheque) {
        chequeService.addCheque(cheque);
    }

    @RequestMapping(value = "/get/{id}", produces = "application/json", method = RequestMethod.GET)
    public @ResponseBody JsonEntity<ChequeDTO> getCheque(@PathVariable("id") long chequeId) {
        //JsonEntity<Cheque> jsonCheque = new JsonEntity<Cheque>(chequeService.getCheque(chequeId));
        Cheque cheque = chequeService.getCheque(chequeId);
        ChequeDTO chequeDTO = new ChequeDTO(cheque);
        return JsonBuilder.entity(chequeDTO)
                          .build();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody JsonEntity<Test> getTest() {
        Test test = new Test();
        test.setName("Bibick");
        test.setId("1");
        return JsonBuilder.entity(test)
                          .build();
    }


}
