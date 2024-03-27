package com.expensemanager.expensemanager.repo;

import com.expensemanager.expensemanager.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface itemRepo extends JpaRepository<Item , Long> {

    List<Item> findAllByH_HeadId(long hid);
}
