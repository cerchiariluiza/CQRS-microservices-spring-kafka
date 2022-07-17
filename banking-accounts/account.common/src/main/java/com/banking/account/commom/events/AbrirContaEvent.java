package com.banking.account.commom.events;

import com.banking.account.commom.dto.AccountType;
import com.banking.cqrs.core.commands.BaseCommmand;
import com.banking.cqrs.core.events.BaseEvent;

import java.util.Date;

public class AbrirContaEvent extends BaseEvent{
    private String accountHolder;
    private AccountType accountType;
    private Date createdDate;
    private double openingBalance;

    public AbrirContaEvent(String id) {
        super(id);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }
}
