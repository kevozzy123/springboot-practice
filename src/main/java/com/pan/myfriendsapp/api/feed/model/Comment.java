package com.pan.myfriendsapp.api.feed.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long feedId;

    private Long userId;

    private String content;

    private Instant createdAt;
}
