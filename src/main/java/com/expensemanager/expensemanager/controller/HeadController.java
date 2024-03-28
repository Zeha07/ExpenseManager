package com.expensemanager.expensemanager.controller;


import com.expensemanager.expensemanager.model.head;
import com.expensemanager.expensemanager.repo.headrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/director/Head")
public class HeadController {

    @Autowired
    headrepo headr;

    @PostMapping("/createHead")
    boolean createNewHead(@RequestParam String headname) throws Exception{
        head h = headr.findByHeadName(headname);

        if(h != null){
          throw new RuntimeException("Head Present !!!");
        }

        try{
            h = new head();
            h.setHeadName(headname);
            headr.save(h);
        }
        catch(Exception e ){
            throw new RuntimeException(e);
        }

        h = headr.findByHeadName(headname);
        return (h!=null);
    }


    @GetMapping("/getHeads")
    List<String> getAllHeads(){
        List<String> l = new ArrayList<>();
        List<head> h = headr.findAll();
        for( head H : h){
            l.add(H.getHeadName());
        }

        return l;
    }

}
