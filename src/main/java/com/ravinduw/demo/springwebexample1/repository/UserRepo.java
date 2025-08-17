package com.ravinduw.demo.springwebexample1.repository;

import com.ravinduw.demo.springwebexample1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE u.userName = ?1")
    User findByUserName(String userName);

}
