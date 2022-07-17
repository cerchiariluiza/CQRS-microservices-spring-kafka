package com.banking.account.cmd.api.command;

import com.banking.cqrs.core.commands.BaseCommmand;

public class RetirarDinheiroCommand extends BaseCommmand {


    private double amount;

    public RetirarDinheiroCommand(String id) {
        super(id);
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
