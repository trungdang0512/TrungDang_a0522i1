package com.example.furamaspring.service.impl;

import com.example.furamaspring.dto.ClientListDto;
import com.example.furamaspring.model.Client;
import com.example.furamaspring.repository.IClientRepository;
import com.example.furamaspring.service.IClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService implements IClientService {
    @Autowired
    private IClientRepository clientRepository;

    @Override
    public List<ClientListDto> findAll() {
        List<Client> clients = clientRepository.findAll();
        List<ClientListDto> clientListDtos = new ArrayList<>();
        ClientListDto clientListDto;
        for (Client client: clients){
            clientListDto = new ClientListDto();
            BeanUtils.copyProperties(clients, clientListDto);
            clientListDtos.add(clientListDto);
        }
        return clientListDtos;
    }

    @Override
    public Page<Client> getAllWithPage(PageRequest pageRequest) {
        return clientRepository.findAllWithPage(pageRequest);
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
