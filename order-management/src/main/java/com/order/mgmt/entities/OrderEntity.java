package com.order.mgmt.entities;

import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order")
@Data
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private long orderId;
    @Basic
    @Column(name = "user_id")
    private long userId;
    @Basic
    @Column(name = "item_id")
    private long itemId;
    @Basic
    @Column(name = "item_quantity")
    private int itemQuantity;
    @Basic
    @Column(name = "order_status")
    private String orderStatus;
    @Basic
    @Column(name = "ordered_date_time")
    private Date orderedDateTime;

}
