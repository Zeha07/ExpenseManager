package com.expensemanager.expensemanager.model;
import jakarta.persistence.*;

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
}
