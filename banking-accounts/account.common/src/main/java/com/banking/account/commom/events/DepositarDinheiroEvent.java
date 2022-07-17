package com.banking.account.commom.events;

import com.banking.cqrs.core.events.BaseEvent;

public class DepositarDinheiroEvent extends BaseEvent {

    private double amount;

    public DepositarDinheiroEvent(String id) {
        super(id);
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
