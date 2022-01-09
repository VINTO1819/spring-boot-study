package org.example.springbootstudy.domain.post.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.springbootstudy.domain.post.entity.PostEntity;

@AllArgsConstructor
@Getter
public class CreateNewPostRequestDto {
    private final String title;
    private final String content;
    private final String author;

    public PostEntity toEntity() {
        return PostEntity.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
