package com.pan.myfriendsapp.api.feed.service;

import com.pan.myfriendsapp.api.feed.model.Like;
import com.pan.myfriendsapp.api.feed.repository.LikeRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    private final LikeRepository likeRepository;


    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public void likePost(Long feedId, Long userId) {

        if (likeRepository.existsByFeedIdAndUserId(feedId, userId)) {
            return; // already liked
        }

        Like like = new Like();
        like.setFeedId(feedId);
        like.setUserId(userId);

        likeRepository.save(like);
    }
}
