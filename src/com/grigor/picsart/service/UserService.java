package com.grigor.picsart.service;


import com.grigor.picsart.model.user.User;

import java.util.Scanner;

public class UserService {
    public static User createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name ->");
        String name = scanner.nextLine();
        System.out.println("Input surname ->");
        String surName = scanner.nextLine();
        System.out.println("Input user name -> (minimum 10 symbols.)");
        String userName = scanner.nextLine();
        System.out.println("Input email address ->");
        String email = scanner.nextLine();
        System.out.println("Input password -> (password will be minimum 8 symbols and will contain 2 uppercase letter and 3 number.)");
        String password = scanner.nextLine();
        return new User(name, surName, userName, email, password);
    }
}
