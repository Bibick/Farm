package com.bibick.core.service;

import com.bibick.core.model.Item;

import java.util.List;

/**
 * User: istrakhouski
 * Date: 12/23/13 3:40 PM
 */
public interface ItemService {

    public void addItem(Item item);

    public List<Item> getAllItems();

    public void updateItem(Item item);
}
