package com.order.mgmt.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
public class MainmenuSubmenuMapEntityPK implements Serializable {
    @Column(name = "main_menu_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mainMenuId;
    @Column(name = "sub_menu_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subMenuId;

}
