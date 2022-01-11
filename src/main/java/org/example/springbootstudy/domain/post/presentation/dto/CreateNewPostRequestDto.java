package org.example.springbootstudy.domain.post.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootstudy.domain.post.entity.PostEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateNewPostRequestDto {
    private String title;
    private String content;
    private String author;

    public PostEntity toEntity() {
        return PostEntity.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
