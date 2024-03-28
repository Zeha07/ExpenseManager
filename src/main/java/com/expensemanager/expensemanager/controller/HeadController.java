package com.expensemanager.expensemanager.controller;


import com.expensemanager.expensemanager.model.head;
import com.expensemanager.expensemanager.repo.headrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
