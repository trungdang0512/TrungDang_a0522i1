package com.example.prductspingboots.productspringboots.repository;

import com.example.prductspingboots.productspringboots.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "select * from product", countQuery = "select * from product ", nativeQuery = true)
    Page<Product> findAllWithPage(PageRequest pageRequest);
}
