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
@Table(name = "sub_menu")
@Data
public class SubMenuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sub_menu_id")
    private long subMenuId;
    @Basic
    @Column(name = "sub_menu_code")
    private String subMenuCode;
    @Basic
    @Column(name = "sub_menu_name")
    private String subMenuName;
    @Basic
    @Column(name = "sub_menu_desc")
    private String subMenuDesc;
    @Basic
    @Column(name = "is_sub_menu_available")
    private boolean isSubMenuAvailable;
    @Basic
    @Column(name = "is_sub_menu_veg")
    private boolean isSubMenuVeg;
}
