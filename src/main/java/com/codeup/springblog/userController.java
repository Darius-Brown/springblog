package com.codeup.springblog.Controllers;

import com.codeup.springblog.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class userController {
    @GetMapping("users/all")
    public String getAllUsers(
            Model model
    ){
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User("Darius", "Brown"));
        listOfUsers.add(new User("Mike", "G"));
        listOfUsers.add(new User("Samuel", "Moore"));


        model.addAttribute("users", listOfUsers);
        return "users";
    }

    @GetMapping("/user")
    @ResponseBody
    public String getTheStringUser(){
        return "users";
    }
}


