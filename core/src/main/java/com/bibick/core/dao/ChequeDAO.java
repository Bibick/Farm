package com.bibick.core.dao;

import com.bibick.core.model.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:22 PM
 */
public interface ChequeDAO extends JpaRepository<Cheque, Long> {
}
