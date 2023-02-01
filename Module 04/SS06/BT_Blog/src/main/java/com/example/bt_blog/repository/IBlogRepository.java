package com.example.bt_blog.repository;

import com.example.bt_blog.model.Author;
import com.example.bt_blog.model.Blog;
import com.example.bt_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.transaction.Transactional;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @org.springframework.transaction.annotation.Transactional
    @Modifying
    @Query("update blog b set b.id = ?1 " +
            "where b.id is not null and b.title = ?2 and b.content = ?3 and b.category = ?4 and b.author = ?5")
    void updateIdByIdNotNullAndTitleAndContentAndTagAndAuthor(Integer id, @Nullable String title, @Nullable String content, @Nullable Category category, @Nullable Author author);

    @Query(value = "select * from blog", countQuery = "select * from blog ", nativeQuery = true)
    Page<Blog> findAllWithPage(PageRequest pageRequest);
}
