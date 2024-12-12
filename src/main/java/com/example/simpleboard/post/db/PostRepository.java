package com.example.simpleboard.post.db;

import com.example.simpleboard.board.db.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

    public Optional<PostEntity> findFirstByIdAndStatusOrderByIdDesc(Long id, String status);
}
