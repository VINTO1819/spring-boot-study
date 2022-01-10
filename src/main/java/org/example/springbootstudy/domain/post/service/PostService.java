package org.example.springbootstudy.domain.post.service;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.post.entity.PostEntity;
import org.example.springbootstudy.domain.post.presentation.dto.CreateNewPostRequestDto;
import org.example.springbootstudy.domain.post.presentation.dto.CreateNewPostResponseDto;
import org.example.springbootstudy.domain.post.presentation.dto.PostDto;
import org.example.springbootstudy.domain.post.presentation.dto.UpdatePostDto;
import org.example.springbootstudy.domain.post.repository.PostRepository;
import org.example.springbootstudy.domain.post.facade.PostFacade;
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

    public void delete(Long postId) {
        postRepository.deleteById(postId);
    }

}
