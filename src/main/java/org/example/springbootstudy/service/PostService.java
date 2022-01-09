package org.example.springbootstudy.service;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.dto.*;
import org.example.springbootstudy.domain.entity.PostEntity;
import org.example.springbootstudy.domain.repository.PostRepository;
import org.example.springbootstudy.facade.PostFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostFacade postFacade;

    public CreateNewPostResponseDto createNew(CreateNewPostRequestDto dto) {
        PostEntity savedEntity = postRepository.save(dto.toEntity());
        return CreateNewPostResponseDto.fromEntity(savedEntity);
    }

    public List<PostDto> getAll() {
        return postRepository.findAll().stream().map(PostDto::fromEntity).collect(Collectors.toList());
    }

    public PostDto update(Long postId, UpdatePostDto dto) {
        Optional<PostEntity> postOptional = postRepository.findById(postId);

        PostEntity post = postOptional.get();

        if(dto.getTitle() != null) post.updateTitle(dto.getTitle());
        if(dto.getContent() != null) post.updateContent(dto.getContent());

        return PostDto.fromEntity(post);
    }

}
