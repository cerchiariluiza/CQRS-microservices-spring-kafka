package com.banking.account.commom.events;

import com.banking.cqrs.core.events.BaseEvent;

public class FecharContaEvent extends BaseEvent {
    public FecharContaEvent(String id) {
        super(id);
    }
}