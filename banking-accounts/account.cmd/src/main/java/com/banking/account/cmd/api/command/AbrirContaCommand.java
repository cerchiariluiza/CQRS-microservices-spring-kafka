package com.banking.account.cmd.api.command;

import com.banking.account.commom.dto.AccountType;
import com.banking.cqrs.core.commands.BaseCommmand;

public class AbrirContaCommand extends BaseCommmand {

    private String accountHolder;
    private AccountType accountType;
    private double  openingBalance;

    public AbrirContaCommand(String id) {
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

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }
}
