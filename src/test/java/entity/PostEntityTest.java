package entity;

import org.example.springbootstudy.Application;
import org.example.springbootstudy.controller.HelloController;
import org.example.springbootstudy.domain.entity.PostEntity;
import org.example.springbootstudy.domain.repository.PostRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= Application.class)
@SpringBootTest()
public class PostEntityTest {

    @Autowired
    private PostRepository postRepository;

    @After
    public void cleanup() {
        postRepository.deleteAll();
    }

    @Test
    public void saveAndLoad() {
        String title = "테스트 타이틀-" + String.valueOf(System.currentTimeMillis());
        String content = "테스트 내용-" + String.valueOf(Math.round(Math.random() * 100 + 1));
        String author = "test@test.com";

        PostEntity postEntity = PostEntity.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();

        postRepository.save(postEntity);

        List<PostEntity> postList = postRepository.findAll();
        PostEntity createdPost = postList.get(0);

        assertThat(createdPost.getTitle()).isEqualTo(title);
        assertThat(createdPost.getContent()).isEqualTo(content);
        assertThat(createdPost.getAuthor()).isEqualTo(author);
    }

}
