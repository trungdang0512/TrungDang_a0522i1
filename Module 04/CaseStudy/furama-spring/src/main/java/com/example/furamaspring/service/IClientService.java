package com.example.furamaspring.service;

import com.example.furamaspring.dto.ClientListDto;
import com.example.furamaspring.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IClientService {
    List<ClientListDto> findAll();
    Page<Client> getAllWithPage(PageRequest pageRequest);
    void save(Client client);
    Client findById(Long id);
    void deleteById(Long id);
}
