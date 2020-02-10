package com.artiushenko.socnet.role.controller;

import com.artiushenko.socnet.role.entity.Role;
import com.artiushenko.socnet.role.servise.RoleServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleServise roleServise;

    @GetMapping("/id")
    public Role getRole(@PathVariable("id")UUID id){
        return roleServise.getRole(id);
    }

    @GetMapping
    public List<Role> getRoles(){
        return roleServise.getRoles();
    }
}
