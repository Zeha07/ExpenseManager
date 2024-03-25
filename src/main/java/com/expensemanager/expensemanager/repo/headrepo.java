package com.expensemanager.expensemanager.repo;

import com.expensemanager.expensemanager.model.head;
import org.springframework.data.jpa.repository.JpaRepository;

public interface headrepo extends JpaRepository<head,Long> {

    public head findByHeadName(String headname);
}
