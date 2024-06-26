package com.example.totalitea.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id", nullable = false)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
