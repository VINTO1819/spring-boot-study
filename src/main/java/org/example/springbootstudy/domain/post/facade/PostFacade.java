package org.example.springbootstudy.domain.post.facade;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.post.repository.PostRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostFacade {

    private final PostRepository postRepository;

}
