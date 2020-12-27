package com.grigor.picsart.model.user;

import com.grigor.picsart.model.StringRepresentableObject;

import java.util.List;

public class User implements StringRepresentableObject {
    private final String name;
    private final String surName;
    private final String userName;
    private final String email;
    private final String password;

    public User(String name, String surName, String userName, String email, String password) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }


    public String getSurName() {
        return surName;
    }


    public String getUserName() {
        return userName;
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}' + "\n";
    }

    @Override
    public List<String> fieldsAsString() {
        return List.of(name, surName, userName, email, password);
    }
}
