package com.expensemanager.expensemanager.service;

import java.util.List;

public interface headservice {

    boolean createNewHead(String headname) throws Exception;

    List<String> getAllheads();
}
