package com.bibick.core.service;

import com.bibick.core.model.Cheque;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:20 PM
 */
public interface ChequeService {

    void addCheque(Cheque cheque);

    Cheque getCheque(long chequeId);


}
