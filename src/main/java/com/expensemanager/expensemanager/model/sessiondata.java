package com.expensemanager.expensemanager.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table
public class sessiondata {

    @Id
    private long sessionId;

    private long startyear;
    private long endyear;

}
