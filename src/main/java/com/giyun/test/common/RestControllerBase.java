package com.giyun.test.common;

import com.giyun.test.dto.PageDto;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public abstract class RestControllerBase {

    @Autowired
    private Gson gson;

    static private final int FAIL = 0;
    static private final int SUCCESS = 1;
    static protected final int DEFAULT_PAGING_START = 0;
    static protected final int DEFAULT_PAGING_SIZE = 10;

    protected <T> String createSuccess(T value){
        ApiResponse<T> response = new ApiResponse<T>();
        response.setResult(SUCCESS);
        response.setData(value);
        return gson.toJson(response);
    }
    protected String createSuccessForPaging(List<?> value, int total, int start, int size) {
        ApiResponse<List<?>> response = new ApiResponse<List<?>>();
        response.setResult(SUCCESS);
        response.setData(value);
        response.setTotal(total);
        response.setPageInfo(getPageInfo(start, size, total));
        return gson.toJson(response);
    }

    protected String createFail(String message) {
        ApiResponse<String> response = new ApiResponse<String>();
        response.setResult(FAIL);
        response.setReason(message);
        return gson.toJson(response);
    }

    protected String createFail(Throwable e) {
        ApiResponse<String> response = new ApiResponse<String>();
        response.setResult(FAIL);
        response.setReason(e.getMessage());

        log.error("", e);
        return gson.toJson(response);
    }

    private PageDto getPageInfo(int start, int size, int totalCount) {
        PageDto pageInfo = new PageDto();
        List<Integer> pageList = new ArrayList<Integer>();
        int startPage = (int) Math.ceil((double)start/(double)size/5)==0 ? 1 : (int) Math.ceil((double)(start+10)/(double)size/5)*5-4;
        int maxPage = (int) Math.ceil((double)totalCount/(double)size) > startPage+4 ? startPage+4 : (int) Math.ceil((double)totalCount/(double)size);
        for(int i = startPage; i<=maxPage; i++){
            pageList.add(i);
        }
        pageInfo.setStart(start);
        pageInfo.setSize(size);
        pageInfo.setPages(pageList);
        pageInfo.setPrevActive(startPage == 1 ? false : true);
        pageInfo.setNextActive((int)Math.ceil((double)totalCount/(double)size) > startPage+4 ? true : false);
        pageInfo.setActivePage((int) Math.ceil((double) start / (double) size) == 0 ? 1 : (int)Math.ceil((double)start/(double)size)+1);
        return pageInfo;
    }
}
