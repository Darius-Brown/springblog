package com.codeup.springblog.Controllers;

import com.codeup.springblog.Repositories.PostsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    private PostsRepository postsDao;

    private UsersRepository usersDao;

    public PostController(PostsRepository postsRepository, UsersRepository, usersRepository) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String index(Model model){
        model.addAttribute("posts", "posts index page");
        return "posts/index";
    }
//
//    @GetMapping("/posts/{id}")
//    public String index(Model model){
//        model.addAttribute("create", "view posts by id posts");
//        return "posts/show";
//    }
//
//    @GetMapping("/posts/create")
//    public String index(Model model){
//        model.addAttribute("create", "view form for creating posts");
//        return "posts/show";
//    }
//
//    @GetMapping("/posts/create")
//    public String index(Model model){
//        model.addAttribute("posts", "create new posts");
//        return "posts/index";
//    }
}
