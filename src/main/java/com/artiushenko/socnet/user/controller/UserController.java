package com.artiushenko.socnet.user.controller;

import com.artiushenko.socnet.user.entity.User;
import com.artiushenko.socnet.user.servise.UserServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServise userServise;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") final UUID id){
        return userServise.getUser(id);
    }

    @GetMapping
    public List getUsers(){
        return userServise.getUsers();
    }
}
