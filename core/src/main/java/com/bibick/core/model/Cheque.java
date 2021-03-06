package com.bibick.core.model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sold_items", joinColumns = @JoinColumn(name = "cheque_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items;

    @Column(name = "summ")
    private BigDecimal summ;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User cashier;

    public long getChequeId() {
        return chequeId;
    }

    public void setChequeId(long chequeId) {
        this.chequeId = chequeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public User getCashier() {
        return cashier;
    }

    public void setCashier(User cashier) {
        this.cashier = cashier;
    }
}
