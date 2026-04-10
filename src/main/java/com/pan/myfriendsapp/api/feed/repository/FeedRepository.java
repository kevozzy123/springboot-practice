package com.pan.myfriendsapp.api.feed.repository;

import com.pan.myfriendsapp.api.feed.model.Feed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long>  {

    Page<Feed> getFeedsByUserId(Long userId, Pageable pageable);

    Feed getFeedById(Long id);
}
