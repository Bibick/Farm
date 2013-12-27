package com.bibick.core.service.impl;

import com.bibick.core.dao.ChequeDAO;
import com.bibick.core.model.Cheque;
import com.bibick.core.service.ChequeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:21 PM
 */
@Service
public class ChequeServiceImpl implements ChequeService {

    @Autowired
    private ChequeDAO chequeDAO;

    public void addCheque(Cheque cheque) {
        chequeDAO.save(cheque);
    }

    public Cheque getCheque(long chequeId) {
        return chequeDAO.findOne(chequeId);
    }
}
