package com.springapp.mvc;

import com.bibick.core.model.Item;
import com.bibick.core.service.ItemService;
import com.bibick.dto.json.JsonBuilder;
import com.bibick.dto.json.JsonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: istrakhouski
 * Date: 12/27/13 4:27 PM
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers="content-type=text/*, application/*")
    @ResponseBody
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public void updateItem(@RequestBody Item item){
        itemService.updateItem(item);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public JsonEntity<List<Item>> getAllItems() {
        return JsonBuilder.entity(itemService.getAllItems())
                          .build();
    }

}
