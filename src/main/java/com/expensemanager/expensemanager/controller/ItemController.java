package com.expensemanager.expensemanager.controller;


import com.expensemanager.expensemanager.model.Item;
import com.expensemanager.expensemanager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/director/item")
public class ItemController {

    @Autowired
    ItemService its;

    @PostMapping("/addItem")
    public boolean addItem(@RequestParam String headname , @RequestParam String itemname){
        Item i = new Item();
        i.setItemname(itemname);
        try{
            return its.addItem(i,headname);
        }
        catch(Exception e){
            throw  new RuntimeException(e);
        }


    }
}
