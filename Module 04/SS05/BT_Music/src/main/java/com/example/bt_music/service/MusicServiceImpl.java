package com.example.bt_music.service;

import com.example.bt_music.dto.MusicListDto;
import com.example.bt_music.model.Music;
import com.example.bt_music.repository.IMusicRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MusicServiceImpl implements IMusicService{
    @Autowired
    private IMusicRepository musicRepository;
    @Override
    public List<MusicListDto> findAll() {
        List<MusicListDto> musicListDtos = new ArrayList<>();
        List<Music> musicList = musicRepository.findAll();
        MusicListDto musicListDto;
        for (Music music: musicList){
            musicListDto = new MusicListDto();
            BeanUtils.copyProperties(music, musicListDto);
            musicListDtos.add(musicListDto);
        }
        return musicListDtos;
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Music findById(Integer id) {
        return musicRepository.findById(id);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public void delete(Integer id) {
        musicRepository.delete(id);
    }
}
