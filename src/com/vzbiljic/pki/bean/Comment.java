package com.vzbiljic.pki.bean;

/**
 * Created by vzbiljic on 13.3.17..
 */

public class Comment implements IBean{
    private String comment;
    private String user;
    private String date;

    public Comment(String comment, String user, String date) {
        this.comment = comment;
        this.user = user;
        this.date = date;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
