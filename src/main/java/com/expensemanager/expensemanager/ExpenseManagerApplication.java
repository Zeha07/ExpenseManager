package com.expensemanager.expensemanager;

import com.expensemanager.expensemanager.model.Item;
import com.expensemanager.expensemanager.service.ItemService;
import com.expensemanager.expensemanager.service.headservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.util.List;

@SpringBootApplication
public class ExpenseManagerApplication implements CommandLineRunner {

    @Autowired
    private headservice heads;

    @Autowired
    private ItemService items;
    public static void main(String[] args) {
        SpringApplication.run(ExpenseManagerApplication.class, args);

        System.out.println("Code Working !!!!");
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> l = items.getAllItems(1);

        for(String s : l){
            System.out.println(s);
        }
        System.out.println("code finished !!!");
    }
}
