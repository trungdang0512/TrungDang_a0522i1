package com.example.caculator.service;

import com.example.caculator.repository.AppRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements IAppService{
    @Autowired
    private AppRepositoryImpl appRepository;

    @Override
    public float addFuction(Float num1, Float num2) {
        return appRepository.addFuction(num1,num2);
    }

    @Override
    public float subFuction(Float num1, Float num2) {
        return appRepository.subFuction(num1,num2);
    }

    @Override
    public float mulFuction(Float num1, Float num2) {
        return appRepository.mulFuction(num1,num2);
    }

    @Override
    public float divFuction(Float num1, Float num2) {
        return appRepository.divFuction(num1,num2);
    }
}
