package com.example.session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/post")
    public String post() {
        return "게시글 조회";
    }

    @PostMapping("/post")
    public String writePost(@RequestBody String postContent) {
        return postContent + "게시글이 작성되었습니다";
        }
}
