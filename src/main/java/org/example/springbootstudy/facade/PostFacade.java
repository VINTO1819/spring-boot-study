package org.example.springbootstudy.facade;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.dto.*;
import org.example.springbootstudy.domain.entity.*;
import org.example.springbootstudy.domain.repository.PostRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostFacade {

    private final PostRepository postRepository;

}
