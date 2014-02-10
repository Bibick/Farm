package com.bibick.dto.model;

import com.bibick.core.model.Cheque;
import com.bibick.core.model.Item;
import com.bibick.core.model.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * User: istrakhouski
 * Date: 2/7/14 4:53 PM
 */
public class ChequeDTO {
    private long chequeId;

    private Date createDate;

    private Date closeDate;

    private List<Item> items;

    private BigDecimal summ;

    private User cashier;

    public ChequeDTO(Cheque cheque) {
        this.chequeId = cheque.getChequeId();
        this.summ = cheque.getSumm();
        this.closeDate = cheque.getCloseDate();
        this.createDate = cheque.getCreateDate();
        this.items = cheque.getItems();
        this.cashier = cheque.getCashier();
    }

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
