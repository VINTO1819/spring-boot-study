package controller;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.Application;
import org.example.springbootstudy.controller.PostController;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= Application.class)
@SpringBootTest
@AllArgsConstructor
public class PostControllerTest {

    private final MockMvc mvc;

}
