package com.order.mgmt.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
public class SubmenuItemsMapEntityPK implements Serializable {
    @Column(name = "sub_menu_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subMenuId;
    @Column(name = "item_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

}
