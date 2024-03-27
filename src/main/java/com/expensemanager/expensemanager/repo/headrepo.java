package com.expensemanager.expensemanager.repo;

import com.expensemanager.expensemanager.model.head;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface headrepo extends JpaRepository<head,Long> {

    public head findByHeadName(String headname);

    @Query("select headName from head ORDER BY headId")
    List<String> findSortedHeadById();

    boolean existsByHeadId(long hid);




}
