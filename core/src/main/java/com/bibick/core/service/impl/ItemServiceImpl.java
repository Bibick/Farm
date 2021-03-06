package com.bibick.core.service.impl;

import com.bibick.core.dao.ItemDAO;
import com.bibick.core.model.Item;
import com.bibick.core.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: istrakhouski
 * Date: 10/31/13 5:04 PM
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    ItemDAO itemDAO;

    public void addItem(Item item) {
        itemDAO.save(item);
    }

    public List<Item> getAllItems() {
        return itemDAO.findAll();
    }

    public void updateItem(Item item) {
        itemDAO.save(item);
    }
}
