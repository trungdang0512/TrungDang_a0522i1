package com.example.furamaspring.service.impl;

import com.example.furamaspring.model.ClientType;
import com.example.furamaspring.repository.IClientTypeRepository;
import com.example.furamaspring.service.IClientTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientTypeService implements IClientTypeService {
    @Autowired
    private IClientTypeRepository clientTypeRepository;
    @Override
    public List<ClientType> findAll() {
        return clientTypeRepository.findAll();
    }
}
