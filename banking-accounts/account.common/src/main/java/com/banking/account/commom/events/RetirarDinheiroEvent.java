package com.banking.account.commom.events;

import com.banking.cqrs.core.events.BaseEvent;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class RetirarDinheiroEvent extends BaseEvent {


    private double amount;

}
