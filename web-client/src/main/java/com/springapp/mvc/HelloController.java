package com.springapp.mvc;

import com.bibick.core.model.Item;
import com.bibick.core.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    ItemService test;

	@RequestMapping(method = RequestMethod.GET)
    @ResponseBody
	public String printWelcome(ModelMap model) {
        Item item = new Item();
        item.setName("test");
        item.setDescription("descr");

        test.addItem(item);

		return "bob";
	}
}