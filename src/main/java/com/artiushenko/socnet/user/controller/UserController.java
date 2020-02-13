package com.artiushenko.socnet.user.controller;

import com.artiushenko.socnet.user.entity.User;
import com.artiushenko.socnet.user.servise.UserServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
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
        List<User> users = userServise.getUsers();
        return userServise.getUsers();
    }
}
