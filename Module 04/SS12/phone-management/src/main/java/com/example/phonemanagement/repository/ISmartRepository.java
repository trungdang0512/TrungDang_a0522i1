package com.example.phonemanagement.repository;

import com.example.phonemanagement.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartRepository extends JpaRepository<Smartphone, Long> {
}
