package com.pan.myfriendsapp.api.feed.repository;

import com.pan.myfriendsapp.api.feed.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

    List<Like> getLikesByFeed(Long postId, int pageNum, int pageSize);

    boolean existsByFeedIdAndUserId(Long feedId, Long userId);
}
