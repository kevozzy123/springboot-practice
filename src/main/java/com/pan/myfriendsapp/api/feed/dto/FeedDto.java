package com.pan.myfriendsapp.api.feed.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.time.Instant;

public class FeedDto {

    private Long id;
    private String content;
    private Long userId;
    private Instant createdAt;
    private Instant updatedAt;

    public FeedDto() {}

    @JsonCreator
    public FeedDto(Long id, String content, Long userId, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
