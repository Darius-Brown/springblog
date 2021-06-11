package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewHomeController {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}