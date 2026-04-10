package com.pan.myfriendsapp.api.feed.service;

import com.pan.myfriendsapp.api.feed.dto.FeedDto;
import com.pan.myfriendsapp.api.feed.dto.GetFeedsResponse;
import com.pan.myfriendsapp.api.feed.model.Feed;
import com.pan.myfriendsapp.api.feed.repository.FeedRepository;
import com.pan.myfriendsapp.core.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedService {

    private final FeedRepository feedRepository;


    public FeedService(FeedRepository feedRepository) {
        this.feedRepository = feedRepository;
    }

    public GetFeedsResponse getFeedsByUserId(Long userId, Integer pageNum, Integer pageSize) {
        // TODO: check if user has permission to view this feed
        int page = (pageNum == null || pageNum < 0) ? 0 : pageNum;
        int size = (pageSize == null || pageSize <= 0) ? 10 : pageSize;

        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Feed> feeds = feedRepository.getFeedsByUserId(userId, pageable);
        Page<FeedDto> dtoPage = feeds.map(this::mapToDto);

        return new GetFeedsResponse(dtoPage);
    }

    public FeedDto getFeedDetail(Long feedId) {
        // TODO: check if user has permission to view this feed
        Feed feed = feedRepository.findById(feedId)
                .orElseThrow(() -> new ResourceNotFoundException("Feed not found"));

        return mapToDto(feed);
    }

    public List<FeedDto> getFeedsForUser() {

    }

    private FeedDto mapToDto(Feed feed) {
        FeedDto dto = new FeedDto();
        dto.setId(feed.getId());
        dto.setContent(feed.getContent());
        dto.setUserId(feed.getUserId());
        dto.setCreatedAt(feed.getCreatedAt());
        return dto;
    }
}
