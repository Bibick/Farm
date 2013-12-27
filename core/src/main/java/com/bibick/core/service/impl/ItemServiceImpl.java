package com.bibick.core.service.impl;

import com.bibick.core.dao.ItemDAO;
import com.bibick.core.model.Item;
import com.bibick.core.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: istrakhouski
 * Date: 10/31/13 5:04 PM
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    ItemDAO itemDAO;

    public String print() {
        return "Bibick";
    }

    public void addItem(Item item) {
        itemDAO.save(item);
    }
}
