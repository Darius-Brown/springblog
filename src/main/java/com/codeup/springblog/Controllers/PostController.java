//package com.codeup.springblog;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class PostController {
//    private final PostRepository postDao;
//
//    public PostController(PostRepository postDao) {
//        this.postDao = postDao;
//    }
//
//    @GetMapping("/post")
//    public String index(Model model){
//        model.addAttribute("posts", "posts index page");
//        return "index";
//    }
//}
