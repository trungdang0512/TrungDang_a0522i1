package com.example.caculator.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepositoryImpl implements IAppRepository{

    @Override
    public float addFuction(Float num1, Float num2) {
        return num1+num2;
    }

    @Override
    public float subFuction(Float num1, Float num2) {
        return num1-num2;
    }

    @Override
    public float mulFuction(Float num1, Float num2) {
        return num1*num2;
    }

    @Override
    public float divFuction(Float num1, Float num2) {
        return num1/num2;
    }
}
