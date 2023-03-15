package com.example.furamaspring.service;

import com.example.furamaspring.dto.ClientListDto;
import com.example.furamaspring.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IClientService {
    List<Client> findAll();
    Page<Client> getAllWithPage(PageRequest pageRequest);
    void save(Client client);
    Client findById(Long id);
    void deleteById(Long id);
    Page<Client> findAllByName(String name,PageRequest pageRequest);
}
