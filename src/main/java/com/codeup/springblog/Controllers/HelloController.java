package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloController {

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("hello/{name}")
    public String hello(
            @PathVariable String name,
            Model model
    ){
        model.addAttribute("UsersName", name);
        return "helloUser";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello from Spring bot to " + name + " in Marco!";
    }

}