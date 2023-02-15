package com.order.mgmt.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "items")
@Data
public class ItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private long itemId;
    @Basic
    @Column(name = "item_code")
    private String itemCode;
    @Basic
    @Column(name = "item_name")
    private String itemName;
    @Basic
    @Column(name = "item_desc")
    private String itemDesc;
    @Basic
    @Column(name = "is_item_available")
    private boolean isItemAvailable;
    @Basic
    @Column(name = "is_item_veg")
    private boolean isItemVeg;

}
