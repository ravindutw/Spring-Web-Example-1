package com.ravinduw.demo.springwebexample1.service;

import com.ravinduw.demo.springwebexample1.entity.User;
import com.ravinduw.demo.springwebexample1.repository.UserRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public String getName(String userName) {

        User user = userRepo.findByUserName(userName);

        return user.getName();
    }

    public String newUser(User user) {
        userRepo.save(user);
        return "User created successfully";
    }

}
