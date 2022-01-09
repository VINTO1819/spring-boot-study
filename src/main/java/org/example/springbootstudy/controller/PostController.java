package org.example.springbootstudy.controller;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.dto.CreateNewPostRequestDto;
import org.example.springbootstudy.domain.dto.CreateNewPostResponseDto;
import org.example.springbootstudy.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("posts")
public class PostController {
    private final PostService postService;

    @PostMapping
    public CreateNewPostResponseDto createNew(CreateNewPostRequestDto dto) {
        return postService.createNew(dto);
    }

}
