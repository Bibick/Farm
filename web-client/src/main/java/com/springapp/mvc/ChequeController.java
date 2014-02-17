package com.springapp.mvc;

import com.bibick.core.model.Cheque;
import com.bibick.core.service.ChequeService;
import com.bibick.core.service.UserService;
import com.bibick.dto.json.JsonBuilder;
import com.bibick.dto.json.JsonEntity;
import com.bibick.dto.model.ChequeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Date;
import java.util.List;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:18 PM
 */
@Controller
@RequestMapping("/cheque")
public class ChequeController {

    @Autowired
    private ChequeService chequeService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers = "content-type=text/*, application/*")
    @ResponseBody
    public void addCheque(@RequestBody Cheque cheque, Principal principal) {
        //cheque.setCashier(SecurityContextImpl);
        cheque.setCashier(userService.getUserByName(principal.getName()));
        cheque.setCreateDate(new Date());
        chequeService.addCheque(cheque);
    }

    @RequestMapping(value = "/get/{id}", produces = "application/json", method = RequestMethod.GET)
    public @ResponseBody JsonEntity<ChequeDTO> getCheque(@PathVariable("id") long chequeId) {
        Cheque cheque = chequeService.getCheque(chequeId);
        ChequeDTO chequeDTO = new ChequeDTO(cheque);
        return JsonBuilder.entity(chequeDTO)
                          .build();
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody JsonEntity<List<ChequeDTO>> getAllCheques() {
        return JsonBuilder.entity(chequeService.getAllCheques())
                          .build();
    }

}
