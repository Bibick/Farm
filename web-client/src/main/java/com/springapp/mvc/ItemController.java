package com.springapp.mvc;

import com.bibick.core.model.Item;
import com.bibick.core.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:27 PM
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/add")
    public void addItem(Item item) {
        itemService.addItem(item);
    }

}
