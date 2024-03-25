package com.expensemanager.expensemanager.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class head {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long headId;

    private String  headName;

    public head() {
    }

    public long getHeadId() {
        return headId;
    }

    public void setHeadId(long headId) {
        this.headId = headId;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

   @OneToMany(mappedBy = "h",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   @JsonIgnore
   Set<Item> item = new HashSet<>();

    public Set<Item> getItem() {
        return item;
    }

    public void setItem(Set<Item> item) {
        this.item = item;
    }
}
