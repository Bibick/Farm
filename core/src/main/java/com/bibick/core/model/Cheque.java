package com.bibick.core.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * User: istrakhouski
 * Date: 12/24/13 2:21 PM
 */
@Entity
@Table(name = "cheque")
public class Cheque {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "cheque_id")
    private long chequeId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "close_date")
    private Date closeDate;

    @OneToMany
    //@JoinColumn(name = "cheque_id",  nullable = false, insertable = false, updatable = false)
    private List<Item> items;

    @Column(name = "summ")
    private BigDecimal summ;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User cashier;

}
