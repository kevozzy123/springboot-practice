package com.pan.myfriendsapp.api.feed.dto;

import org.springframework.data.domain.Page;

import java.util.List;

public class GetFeedsResponse {

    private List<FeedDto> data;
    private int page;
    private int size;
    private long total;

    public GetFeedsResponse(Page<FeedDto> pageData) {
        this.data = pageData.getContent();
        this.page = pageData.getNumber();
        this.size = pageData.getSize();
        this.total = pageData.getTotalElements();
    }

    public List<FeedDto> getData() {
        return data;
    }

    public int getPage() {
        return page;
    }


    public int getSize() {
        return size;
    }

    public long getTotal() {
        return total;
    }

}
