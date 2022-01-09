package org.example.springbootstudy.domain.post.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class PostEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length= 50, nullable= false)
    private String title;

    @Column(columnDefinition= "TEXT", nullable= false)
    private String content;

    private String author;

    @Builder
    public PostEntity(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public void updateContent(String content) {
        this.content = content;
    }
}
