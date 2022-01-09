package org.example.springbootstudy.controller;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.dto.CreateNewPostRequestDto;
import org.example.springbootstudy.domain.dto.CreateNewPostResponseDto;
import org.example.springbootstudy.domain.dto.PostDto;
import org.example.springbootstudy.domain.dto.UpdatePostDto;
import org.example.springbootstudy.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("posts")
public class PostController {
    private final PostService postService;

    @PostMapping
    public CreateNewPostResponseDto createNew(@RequestBody CreateNewPostRequestDto dto) {
        return postService.createNew(dto);
    }

    @GetMapping
    public List<PostDto> getAll() {
        return postService.getAll();
    }

    @PatchMapping("{postId}")
    public PostDto update(@PathVariable("postId") Long postId, @RequestBody UpdatePostDto dto) {
        return postService.update(postId, dto);
    }
}
