package com.example.bt_music.service;

import com.example.bt_music.dto.MusicListDto;
import com.example.bt_music.model.Music;

import java.util.List;

public interface IMusicService {
    List<MusicListDto> findAll();
    void save(Music music);
    Music findById(Integer id);
    void update(Music music);
    void delete(Integer id);
}
