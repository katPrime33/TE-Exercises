package com.techelevator.message_board.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Message {

    @JsonProperty("message_id")
    private int id;
    @JsonProperty("message_type_id")
    private int messageTypeId;
    @JsonProperty("sender_name")
    private String senderName;
    @JsonProperty("receiver_name")
    private String receiverName;
    @JsonProperty("message_text")
    private String messageText;
    private boolean isPrivate = false;
    private LocalDateTime timestamp;

    public Message(){ }

    public Message(int id, int messageTypeId, String senderName, String receiverName, String messageText){
        this.id = id;
        this.messageTypeId = messageTypeId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.messageText = messageText;
        this.isPrivate = false;
        this.timestamp = getTimestamp();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public int getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(int messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
