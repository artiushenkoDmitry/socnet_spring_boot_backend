package com.artiushenko.socnet.user.servise;

import com.artiushenko.socnet.Exceptions.NotFoundResponseError;
import com.artiushenko.socnet.user.entity.User;
import com.artiushenko.socnet.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserServise {
    private final UserRepository userRepository;

    public User getUser(UUID id){
        return userRepository.findById(id).orElseThrow(()->new NotFoundResponseError(User.class.getName(), id));
    }

    public List<User> getUsers (){
        return userRepository.findAll();
    }
}
