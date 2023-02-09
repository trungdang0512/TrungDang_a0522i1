package com.example.musicspringboot.service;



import com.example.musicspringboot.dto.MusicListDto;
import com.example.musicspringboot.model.Music;

import java.util.List;

public interface IMusicService {
    List<MusicListDto> findAll();
    void save(Music music);
    Music findById(Integer id);
    void update(Music music);
    void delete(Integer id);
}
