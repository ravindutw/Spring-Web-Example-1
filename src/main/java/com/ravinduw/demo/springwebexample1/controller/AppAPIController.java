package com.ravinduw.demo.springwebexample1.controller;

import com.ravinduw.demo.springwebexample1.entity.User;
import com.ravinduw.demo.springwebexample1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app-api")
public class AppAPIController {

    @Autowired
    UserService userService;

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("App is running");
    }

    @GetMapping("/name/{userName}")
    public ResponseEntity<String> getName(@PathVariable String userName) {

        return ResponseEntity.ok(userService.getName(userName));

    }

    @PostMapping("/new-user")
    public ResponseEntity<String> newUser(@RequestBody User user) {

        return ResponseEntity.ok(userService.newUser(user));

    }

}
