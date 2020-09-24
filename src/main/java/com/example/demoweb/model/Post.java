package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public int getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
    public Post(Long id,String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
