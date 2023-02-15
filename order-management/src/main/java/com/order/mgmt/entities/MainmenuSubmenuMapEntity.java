package com.order.mgmt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "mainmenu_submenu_map")
@IdClass(MainmenuSubmenuMapEntityPK.class)
@Data
public class MainmenuSubmenuMapEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "main_menu_id")
    private long mainMenuId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sub_menu_id")
    private long subMenuId;
}
