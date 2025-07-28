package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello {
    @GetMapping("/")
    public String sayHello() {
        return "Yo sup mate";
    }

    @GetMapping("/home")
    public String sayHomeString() {
        return "This is a home route";
    }

    @GetMapping("/list")
    public List<User> getUser() {
        List<User> users = new ArrayList<>();
        users.add(new User("User1", 20, false));
        users.add(new User("User2", 21, true));
        users.add(new User("User3", 25, false));
        users.add(new User("User4", 21, true));
        return users;
    }
}
