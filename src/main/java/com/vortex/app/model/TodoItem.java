package com.vortex.app.model;

import javax.persistence.*;

@Entity
@Table(name = "todoitem")
public class TodoItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "item_name")
    String itemName;

    @Column(name = "is_completed")
    boolean isCompleted;

    public TodoItem() {
        super();
    }

    public TodoItem(int i, String itemName, boolean isCompleted) {
        super();
        this.id = i;
        this.itemName = itemName;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String countryName) {
        this.itemName = countryName;
    }

    public boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}
