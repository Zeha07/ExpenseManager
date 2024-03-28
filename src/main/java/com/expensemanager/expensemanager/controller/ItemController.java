package com.expensemanager.expensemanager.controller;


import com.expensemanager.expensemanager.model.Item;
import com.expensemanager.expensemanager.model.head;
import com.expensemanager.expensemanager.repo.headrepo;
import com.expensemanager.expensemanager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/director/item")
public class ItemController {

    @Autowired
    ItemService its;

    @Autowired
    headrepo headr;

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


    @GetMapping("/getItems")
    List<String> getItems(@RequestParam String headname)throws Exception{
        head h = headr.findByHeadName(headname);
        try{
            return its.getAllItems(h.getHeadId());
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

}
