package com.example.demo2.service;

import com.example.demo2.entity.User;

public class UserServiceImpl{
    public static User selectByID(int id) {
        User user = new User();
        user.setName("a");
        user.setAge(10);
        return user;
    }
}
