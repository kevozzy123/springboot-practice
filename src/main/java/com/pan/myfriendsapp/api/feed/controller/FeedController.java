package com.pan.myfriendsapp.api.feed.controller;

import com.pan.myfriendsapp.api.feed.dto.GetFeedsResponse;
import com.pan.myfriendsapp.api.feed.service.FeedService;
import com.pan.myfriendsapp.api.feed.service.LikeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// This feature is similar to Wechat's PengYouQuan
@RequestMapping("/feeds")
public class FeedController {

    private final FeedService feedService;
    private final LikeService likeService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<GetFeedsResponse> getFeedsByUserId(@PathVariable Long userId, @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return feedService.getFeedsByUserId(userId, pageNum, pageSize);
    }

    @PostMapping("/{feedId}/users/{userId}/like")
    public ResponseEntity<Void> postLikeForFeed(@PathVariable Long feedId, @PathVariable Long userId) {
        likeService.likePost(feedId, userId);
        return ResponseEntity.noContent().build();
    }
}
