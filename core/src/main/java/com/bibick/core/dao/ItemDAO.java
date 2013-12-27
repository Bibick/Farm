package com.bibick.core.dao;

import com.bibick.core.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: istrakhouski
 * Date: 12/23/13 3:35 PM
 */
public interface ItemDAO extends JpaRepository<Item, Long> {
}
