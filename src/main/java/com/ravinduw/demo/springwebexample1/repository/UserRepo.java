package com.ravinduw.demo.springwebexample1.repository;

import com.ravinduw.demo.springwebexample1.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserRepo {

    private final JdbcTemplate jdbcTemplate;


    public User findByUserName(String userName){

        // SQL Query
        String sql = "SELECT username, name FROM users WHERE username = ?";

        // Using JdbcTemplate to execute the query and map the result to User object
        return jdbcTemplate.queryForObject(sql, (result, rowNum) -> {
                    User user = new User();
                    user.setUserName(result.getString("username"));
                    user.setName(result.getString("name"));
                    return user;
        }, userName);

    }

    public User save(User user) {

        // SQL Query
        String sql = "INSERT INTO users (username, name) VALUES (?, ?)";

        // Using JdbcTemplate to execute the insert query
        jdbcTemplate.update(sql, user.getUserName(), user.getName());
        return user;
    }

}
