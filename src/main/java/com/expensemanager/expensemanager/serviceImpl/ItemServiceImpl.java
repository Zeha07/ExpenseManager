package com.expensemanager.expensemanager.serviceImpl;

import com.expensemanager.expensemanager.model.Item;
import com.expensemanager.expensemanager.model.head;
import com.expensemanager.expensemanager.repo.headrepo;
import com.expensemanager.expensemanager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    headrepo headr;

    @Override
    public boolean addItem(Item item, String Headname) throws Exception {
        head local = this.headr.findByHeadName(Headname);

        if(local == null){
            System.out.println("Head not present");
            throw new Exception("Head Absent");
        }

        item.setH(local);
        local.getItem().add(item);
        headr.save(local);
      return true;

    }
}
