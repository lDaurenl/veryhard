package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    public PostService(){
        this.posts= new ArrayList<>();

        this.posts.add(new Post((long) 0,"я есть текст0", new Date()));
        this.posts.add(new Post((long) 1,"я есть текст1", new Date()));
        this.posts.add(new Post((long) 2,"я есть текст2", new Date()));
    }
    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) (this.posts.size()-1),text, new Date()));
    }
}
