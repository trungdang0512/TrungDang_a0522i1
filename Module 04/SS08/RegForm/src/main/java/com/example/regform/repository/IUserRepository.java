package com.example.regform.repository;

import com.example.regform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, Long> {
}
