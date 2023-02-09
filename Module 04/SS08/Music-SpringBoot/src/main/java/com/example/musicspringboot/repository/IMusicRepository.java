package com.example.musicspringboot.repository;



import com.example.musicspringboot.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IMusicRepository extends JpaRepository<Music, Integer> {
}
