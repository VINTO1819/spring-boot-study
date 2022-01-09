package controller;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= Application.class)
@SpringBootTest
@AllArgsConstructor
public class PostControllerTest {

    private final MockMvc mvc;

}
