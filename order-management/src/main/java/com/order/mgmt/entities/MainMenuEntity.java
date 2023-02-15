package com.order.mgmt.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "main_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainMenuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "main_menu_id")
    private long mainMenuId;
    @Basic
    @Column(name = "main_menu_code")
    private String mainMenuCode;
    @Basic
    @Column(name = "main_menu_name")
    private String mainMenuName;
    @Basic
    @Column(name = "main_menu_desc")
    private String mainMenuDesc;
    @Basic
    @Column(name = "is_main_menu_available")
    private boolean isMainMenuAvailable;
    @Basic
    @Column(name = "is_main_menu_veg")
    private boolean isMainMenuVeg;
}
