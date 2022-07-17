package com.banking.cqrs.core.commands;

import com.banking.core.messages.Message;

public abstract class BaseCommmand extends Message{

    public BaseCommmand(String id){
        super(id);


    }
}
