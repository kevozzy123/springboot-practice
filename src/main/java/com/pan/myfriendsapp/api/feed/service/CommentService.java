package com.pan.myfriendsapp.api.feed.service;

import com.pan.myfriendsapp.api.feed.model.Comment;
import com.pan.myfriendsapp.api.feed.repository.CommentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentRepository commentRepository;


    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void getComments(Long feedId, int pageNumber, int pageSize) {
        Page<Comment> page = commentRepository.findByFeedId(feedId, PageRequest.of(pageNumber, pageSize));


    }
}
