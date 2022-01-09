package org.example.springbootstudy.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UpdatePostDto {
    private final String title;
    private final String content;
}
