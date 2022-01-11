package org.example.springbootstudy.domain.view.presentation;

import lombok.AllArgsConstructor;
import org.example.springbootstudy.domain.post.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class ViewController {
    private final PostService postService;

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("posts", postService.getAllByDesc());

        return "index";
    }

    @GetMapping("/posts/save")
    public String getNewPostPage() {
        return "new-post";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(@PathVariable("id") Long postId, Model model) {
        model.addAttribute("post", postService.getById(postId));

        return "edit-post";
    }

}
