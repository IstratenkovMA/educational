package com.educational.controller;

import com.educational.dao.PostRepository;
import com.educational.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author miis0317
 * @date 27-09-18
 */
@Controller
@RequestMapping("/post")
public class PostController {

    private PostRepository repository;

    @Autowired
    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Post createPost(@RequestBody Post post) {
        return repository.saveAndFlush(post);
    }

    @GetMapping("/get")
    public Post getPostById(@RequestParam(name = "id", defaultValue = "-1") long id) {
        return repository.getOne(id);
    }
}
