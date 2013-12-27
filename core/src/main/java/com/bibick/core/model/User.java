package com.bibick.core.model;

import javax.persistence.*;
import java.security.Security;

/**
 * User: istrakhouski
 * Date: 12/24/13 2:22 PM
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

}
