package com.example.drifttalk.Models;

public class MessageModel {

    String uId, message, messageId;
    Long timesamp;
    String recId;

    public MessageModel(String uId, String message, Long timesamp) {
        this.uId = uId;
        this.message = message;
        this.timesamp = timesamp;
    }

    public MessageModel(String uId, String message) {
        this.uId = uId;
        this.message = message;
    }



    public MessageModel(){

    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Long getTimesamp() {
        return timesamp;
    }

    public void setTimesamp(Long timesamp) {
        this.timesamp = timesamp;
    }
}
