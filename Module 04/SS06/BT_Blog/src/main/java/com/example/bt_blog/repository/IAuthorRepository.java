package com.example.bt_blog.repository;

import com.example.bt_blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface IAuthorRepository extends JpaRepository<Author, Integer> {
}
