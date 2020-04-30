package com.giyun.test.service;

import com.giyun.test.dto.BoardDto;
import com.giyun.test.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public List<BoardDto> findBoard(String keyword){
        Map<String,Object> params = new HashMap<>();
        if(keyword != null && keyword.length() > 0)    params.put("keyword",keyword);
        return boardMapper.selectBoard(params);
    }
}
