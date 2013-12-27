package com.bibick.core.service.impl;

import com.bibick.core.dao.ItemDAO;
import com.bibick.core.model.Item;
import com.bibick.core.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * User: istrakhouski
 * Date: 10/31/13 5:04 PM
 */
@Component
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
