package com.example.demoweb.controllers;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsCreateController {
    @Autowired
    PostService postService;
//    @ResponseBody
    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appName", "Мое супер приложение");
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String list(@ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}
