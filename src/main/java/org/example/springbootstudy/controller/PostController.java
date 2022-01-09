package org.example.springbootstudy.controller;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.dto.CreateNewPostRequestDto;
import org.example.springbootstudy.domain.dto.CreateNewPostResponseDto;
import org.example.springbootstudy.domain.dto.PostDto;
import org.example.springbootstudy.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
