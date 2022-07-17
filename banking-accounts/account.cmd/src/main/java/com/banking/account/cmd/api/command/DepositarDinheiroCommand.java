package com.banking.account.cmd.api.command;

import com.banking.cqrs.core.commands.BaseCommmand;

public class DepositarDinheiroCommand extends BaseCommmand {

    private double amount;

    public DepositarDinheiroCommand(String id) {
        super(id);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
