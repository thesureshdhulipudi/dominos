package com.order.mgmt.entities;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order_itmes_map")
@Data
public class OrderItmesMapEntity {
    @Id
    @Basic
    @Column(name = "order_id")
    private long orderId;
    @Basic
    @Column(name = "item_id")
    private long itemId;

}
