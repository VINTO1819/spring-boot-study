package org.example.springbootstudy.domain.post.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.springbootstudy.domain.post.entity.PostEntity;

@AllArgsConstructor
@Getter
public class PostDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public static PostDto fromEntity(PostEntity entity) {
        return new PostDto(
                entity.getId(),
                entity.getTitle(),
                entity.getContent(),
                entity.getAuthor()
        );
    }
}
