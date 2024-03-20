package com.expensemanager.expensemanager.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table
public class budgethead {

    @Id
    private long headId;

    private String  headName;

}
