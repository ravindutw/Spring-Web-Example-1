package com.ravinduw.demo.springwebexample1.repository;

import com.ravinduw.demo.springwebexample1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
