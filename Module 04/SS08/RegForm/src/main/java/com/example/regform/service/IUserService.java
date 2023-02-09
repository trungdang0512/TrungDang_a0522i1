package com.example.regform.service;

import com.example.regform.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    void save(User user);
}
