package com.example.furamaspring.repository;

import com.example.furamaspring.model.Client;
import com.example.furamaspring.model.ClientType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IClientTypeRepository extends JpaRepository<ClientType, Long> {
}
