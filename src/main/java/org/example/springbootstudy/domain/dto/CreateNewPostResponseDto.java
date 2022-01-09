package org.example.springbootstudy.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.springbootstudy.domain.entity.PostEntity;

@AllArgsConstructor
@Getter
public class CreateNewPostResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public static CreateNewPostResponseDto fromEntity(PostEntity entity) {
        return new CreateNewPostResponseDto(
                entity.getId(),
                entity.getTitle(),
                entity.getContent(),
                entity.getAuthor()
        );
    }
}
