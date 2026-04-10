package com.pan.myfriendsapp.api.feed.dto;

import java.util.List;

public class GetFeedDetailResponse {

    private Long id;
    private String content;
    private Long userId;

    private Integer likeCount;
    private Integer commentCount;

    private List<CommentDto> previewComments;

    public GetFeedDetailResponse(Long id, String content, Long userId, Integer likeCount, Integer commentCount, List<CommentDto> previewComments) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.previewComments = previewComments;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public List<CommentDto> getPreviewComments() {
        return previewComments;
    }
}
