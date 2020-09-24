package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
    public Post(String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
