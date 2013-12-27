package com.springapp.mvc;

import com.bibick.core.model.Cheque;
import com.bibick.core.service.ChequeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Cheque getCheque(@PathVariable("id") long chequeId) {
        return chequeService.getCheque(chequeId);
    }


}
