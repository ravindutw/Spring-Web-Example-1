package com.ravinduw.demo.springwebexample1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @Column(name = "username")
    private String userName;

    @Column(name = "name")
    private String name;

}
