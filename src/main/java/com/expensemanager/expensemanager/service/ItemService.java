package com.expensemanager.expensemanager.service;

import com.expensemanager.expensemanager.model.Item;

import java.util.List;

public interface ItemService {
   public boolean addItem(Item item , String Headname) throws Exception;

   List<String> getAllItems(long hid)throws Exception;
}
