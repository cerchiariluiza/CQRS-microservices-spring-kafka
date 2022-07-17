package com.banking.core.messages;

public abstract class Message {

    private String id;

    public Message(String id) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
