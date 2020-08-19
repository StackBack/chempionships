package com.example.demo.services;

import com.example.demo.domain.CustomUser;
import com.example.demo.repository.IUserRepos;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    private final IUserRepos userRepos;

    public UserService(IUserRepos userRepos) {
        this.userRepos = userRepos;
    }

    public boolean addUser(@RequestBody CustomUser customUser){
        if (userRepos.existsByEmail(customUser.getEmail()))
            return false;
        try{
            userRepos.save(customUser);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
