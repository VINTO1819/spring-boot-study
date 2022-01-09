package org.example.springbootstudy.service;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.dto.*;
import org.example.springbootstudy.domain.entity.PostEntity;
import org.example.springbootstudy.domain.repository.PostRepository;
import org.example.springbootstudy.facade.PostFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostFacade postFacade;

    public CreateNewPostResponseDto createNew(CreateNewPostRequestDto dto) {
        PostEntity savedEntity = postRepository.save(dto.toEntity());
        return CreateNewPostResponseDto.fromEntity(savedEntity);
    }

}
