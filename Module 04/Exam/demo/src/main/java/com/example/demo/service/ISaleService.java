package com.example.demo.service;

import com.example.demo.model.Sale;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ISaleService {
    List<Sale> findAll();
    void save(Sale sale);
    Sale findById(Long id);
    void deleteById(Long id);
    List<Sale> find(String q);
    List<Sale> findByPrice(Integer price);
    List<Sale> findByStart(String start);
    List<Sale> findByEnd(String end);

}
