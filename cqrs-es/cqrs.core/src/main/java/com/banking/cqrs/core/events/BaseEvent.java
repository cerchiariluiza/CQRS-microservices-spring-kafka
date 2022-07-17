package com.banking.cqrs.core.events;

import com.banking.core.messages.Message;

public abstract class BaseEvent extends Message{

    public BaseEvent(String id){
        super(id);


    }
}
