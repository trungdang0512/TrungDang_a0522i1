package com.example.bt_music.repository;

import com.example.bt_music.model.Music;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IMusicRepository {
    List<Music> findAll();
    void save(Music music);
    Music findById(Integer id);
    void update(Music music);
    void delete(Integer id);
}
