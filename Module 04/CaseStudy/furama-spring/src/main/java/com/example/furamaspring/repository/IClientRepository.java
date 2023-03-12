package com.example.furamaspring.repository;

import com.example.furamaspring.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface IClientRepository extends JpaRepository<Client, Long> {
    @Query(value = "select * from client", countQuery = "select * from client ", nativeQuery = true)
    Page<Client> findAllWithPage(PageRequest pageRequest);

    Page<Client> findAllByNameLike(String name, PageRequest pageRequest);

}
