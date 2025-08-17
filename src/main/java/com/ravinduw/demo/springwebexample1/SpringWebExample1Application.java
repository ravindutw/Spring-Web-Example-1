package com.ravinduw.demo.springwebexample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ravinduw.demo.springwebexample1.repository")
public class SpringWebExample1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebExample1Application.class, args);
    }

}
