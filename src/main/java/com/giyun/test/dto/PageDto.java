package com.giyun.test.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageDto {
    private int start;
    private int size;
    private List<Integer> pages;
    private boolean prevActive;
    private boolean nextActive;
    private int activePage;
    @Override
    public String toString() {
        return "PageDto [start=" + start + ", size=" + size + ", pages=" + pages + ", prevActive=" + prevActive
                + ", nextActive=" + nextActive + ", activePage=" + activePage + "]";
    }


}