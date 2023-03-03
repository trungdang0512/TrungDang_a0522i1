package com.example.phonemanagement.service.impl;

import com.example.phonemanagement.model.Smartphone;
import com.example.phonemanagement.repository.ISmartRepository;
import com.example.phonemanagement.service.ISmartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartService implements ISmartService {
    @Autowired
    private ISmartRepository smartRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartRepository.deleteById(id);
    }
}
