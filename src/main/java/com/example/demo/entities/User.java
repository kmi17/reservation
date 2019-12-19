package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
    @Column(name="FNAME")
    private String firstName;
    @Column(name="LNAME")
    private String lastName;
    @Column(name="EMAIL")
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="PASSWORD")
    private String password;
}
