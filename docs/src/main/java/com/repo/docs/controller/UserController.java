package com.repo.docs.controller;


import com.repo.docs.entity.User;
import com.repo.docs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin("*")
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @CrossOrigin("*")
    @PutMapping("/add")
    public String addUser(@Valid @RequestBody(required = true) User user) {
        userService.addUser(user);

        return "User " + user.getUserId() + " added";
    }
}