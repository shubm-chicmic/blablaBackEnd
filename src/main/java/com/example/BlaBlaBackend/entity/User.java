package com.example.BlaBlaBackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @NotNull(message = "FirstName can't be null")
    private String f_name;
    @NotNull(message = "LastName can't be null")
    private String l_name;
    @NotNull(message = "Email can't be null")
    @Email(message = "Enter Valid Email")
    @Column(unique = true)
    private String email;
    @NotNull(message = "Password can't be null")
    private String password;
    @NotNull(message = "DateOfBirth can't be null")
    private  String dob;
    @CreationTimestamp
    private LocalDateTime dateCreated; //epoctime
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String riderPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}