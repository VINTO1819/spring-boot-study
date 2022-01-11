package org.example.springbootstudy.domain.view.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/posts/save")
    public String getNewPostPage() {
        return "new-post";
    }


}
