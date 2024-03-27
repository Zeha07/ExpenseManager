package com.expensemanager.expensemanager.serviceImpl;

import com.expensemanager.expensemanager.model.Item;
import com.expensemanager.expensemanager.model.head;
import com.expensemanager.expensemanager.repo.headrepo;
import com.expensemanager.expensemanager.repo.itemRepo;
import com.expensemanager.expensemanager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    headrepo headr;

    @Autowired
    itemRepo itr;

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

    @Override
    public List<String> getAllItems(long hid) throws Exception {
        boolean b = headr.existsByHeadId(hid);
        List<String> s = new ArrayList<>();
        if(b){
            List<Item> l = itr.findAllByH_HeadId(hid);
            for(Item i : l){
                s.add(i.getItemname());
            }
        }
        else {
            throw new Exception(" Head not found");

        }

        return s;
    }
}
