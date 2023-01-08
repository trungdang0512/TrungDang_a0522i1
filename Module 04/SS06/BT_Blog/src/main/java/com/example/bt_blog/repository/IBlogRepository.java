package com.example.bt_blog.repository;

import com.example.bt_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;

import javax.transaction.Transactional;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @org.springframework.transaction.annotation.Transactional
    @Modifying
    @Query("update blog b set b.title = ?1, b.author = ?2, b.tag = ?3, b.content = ?4")
    void updateTitleAndAuthorAndTagAndContentBy(@Nullable String title, @Nullable String author, @Nullable String tag, @Nullable String content);

}
