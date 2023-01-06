package com.example.bt_music.repository.impl;

import com.example.bt_music.model.Music;
import com.example.bt_music.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepositoryImpl implements IMusicRepository {
    static List<Music> musicList = new ArrayList<>();
    @Override
    public List<Music> findAll() {
        List<Music> music = BaseRepository.entityManager.createQuery("select m from Music m", Music.class).getResultList();
        return music;
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public Music findById(Integer id) {
        Music music = BaseRepository.entityManager.createQuery("select m from Music m where m.id = ?1",Music.class).setParameter(1,id).getSingleResult();
        return music;
    }

    @Override
    public void update(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        Music music = this.findById(id);
        entityTransaction.begin();
        BaseRepository.entityManager.remove(music);
        entityTransaction.commit();
    }
}
