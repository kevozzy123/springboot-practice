package com.pan.myfriendsapp.api.feed.repository;

import com.pan.myfriendsapp.api.feed.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Page<Comment> findByFeedId(Long feedId, Pageable pageable);

}
