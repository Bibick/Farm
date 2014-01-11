package com.bibick.core.model;

import javax.persistence.*;

/**
 * User: istrakhouski
 * Date: 12/23/13 3:17 PM
 */
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "item_id")
    private long itemId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long item_id) {
        this.itemId = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
