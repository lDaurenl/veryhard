package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> posts= new ArrayList<>();

        posts.add(new Post("я есть текст0"));
        posts.add(new Post("я есть текст1"));
        posts.add(new Post("я есть текст2"));

        return posts;
    }
}
