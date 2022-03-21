package com.jo.post.post.controller;

import com.jo.post.post.model.Post;
import com.jo.post.post.model.PostDto;
import com.jo.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    public void savePost(@RequestBody PostDto postDto) {
        postService.savePost(postDto);
    }

    @GetMapping("/post")
    public List<Post> findAllPost() {
        return postService.findAllPost();
    }

    @GetMapping("/post/{id}")
    public Optional<Post> findByPostId(@PathVariable Long id) {
        return postService.findById(id);
    }

    @PutMapping("/post/{id}")
    public void editPost(@PathVariable Long id, @RequestBody PostDto postDto) {
        postService.editPost(id, postDto);
    }

    @DeleteMapping("/post/{id}")
    public void delPost(@PathVariable Long id) {
        postService.delPost(id);
    }

}
