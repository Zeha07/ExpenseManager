package com.expensemanager.expensemanager.serviceImpl;

import com.expensemanager.expensemanager.model.head;
import com.expensemanager.expensemanager.repo.headrepo;
import com.expensemanager.expensemanager.service.headservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class headServiceImpl implements headservice {

    @Autowired
    headrepo headr;
    @Override
    public boolean createNewHead(String headname) throws Exception {

        boolean worked = false;

        head local = this.headr.findByHeadName(headname);

        if(local != null){
            System.out.println("head present !!!");
            throw new Exception("Head Present !!!");
        }


        else {
            head h = new head();
            h.setHeadName(headname);
            headr.save(h);

        }


        local = this.headr.findByHeadName(headname);

        if(local != null){
            worked = true;
        }

        return worked;
    }
}
