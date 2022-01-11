package org.example.springbootstudy.domain.post.repository;

import org.example.springbootstudy.domain.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

    @Query("SELECT post FROM PostEntity post ORDER BY post.id DESC")
    List<PostEntity> getAllDesc();
}
