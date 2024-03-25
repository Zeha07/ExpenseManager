package com.expensemanager.expensemanager.model;


import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iId;

    @Column(name = "itemname")
    private String itemname;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    head h;


    public Item(String itemname, head h) {
        this.itemname = itemname;
        this.h = h;
    }


    public Item() {

    }


    public long getiId() {
        return iId;
    }

    public void setiId(long iId) {
        this.iId = iId;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public head getH() {
        return h;
    }

    public void setH(head h) {
        this.h = h;
    }
}
