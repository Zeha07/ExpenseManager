package com.expensemanager.expensemanager.model;


import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table
public class user {

    @Id
   //@GenerativeValue(strategy = GenerationType.Auto)
     private long id;

    private String username;
    private String password;


}
