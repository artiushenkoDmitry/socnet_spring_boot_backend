package com.artiushenko.socnet.role.servise;

import com.artiushenko.socnet.exceptions.NotFoundResponseError;
import com.artiushenko.socnet.role.entity.Role;
import com.artiushenko.socnet.role.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleServise {
    private final RoleRepository roleRepository;

    public Role getRole (UUID id){
        return roleRepository.findById(id).orElseThrow(()->new NotFoundResponseError(Role.class.getName(), id));
    }

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }
}
