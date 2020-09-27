package com.java.springboot.web;

import com.java.springboot.web.dto.UserStatusDto;
import com.java.springboot.model.Post;
import com.java.springboot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users/")
public class UserController {
    private final PostRepository postRepository;

    @Autowired
    public UserController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @ModelAttribute("user")
    public UserStatusDto userStatusDto() {
        return new UserStatusDto();
    }

    @GetMapping("addStatus")
    public String showStatusForm(Post post) {
        return "add-status";
    }

    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("users", postRepository.findAll());
        return "index";
    }

    @PostMapping("add")
    public String addPost(Post post, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-status";
        }

        postRepository.save(post);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid post Id:" + id));
        model.addAttribute("post", post);
        return "update-status";
    }

    @PostMapping("update/{id}")
    public String updateStatus(@PathVariable("id") long id, Post post, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            post.setId(id);
            return "update-status";
        }

        postRepository.save(post);
        model.addAttribute("users", postRepository.findAll());
        return "index";
    }

}
