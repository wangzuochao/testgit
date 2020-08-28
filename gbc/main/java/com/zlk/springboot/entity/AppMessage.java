package com.zlk.springboot.entity;

import org.springframework.stereotype.Repository;

/**
  * @Description:
  * @Param:
  * @return:
  * @Author: WangZuochao
  * @Date: 2020/8/13
  */
@Repository
public class AppMessage {

    private String id;
    private String message;
    private String senddate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenddate() {
        return senddate;
    }

    public void setSenddate(String senddate) {
        this.senddate = senddate;
    }

    public AppMessage(String id, String message, String senddate) {
        this.id = id;
        this.message = message;
        this.senddate = senddate;
    }

    public AppMessage() {
    }

    @Override
    public String toString() {
        return "AppMessage{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", senddate='" + senddate + '\'' +
                '}';
    }
}
