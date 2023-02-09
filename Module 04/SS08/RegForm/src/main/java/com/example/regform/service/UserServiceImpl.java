package com.example.regform.service;

import com.example.regform.model.User;
import com.example.regform.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
