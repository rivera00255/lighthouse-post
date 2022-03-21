package com.jo.post.postImg.model;

import com.jo.post.post.model.Post;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PostImg {

    private Long id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    private String url;
}
