package com.giyun.test.controller;

import com.giyun.test.common.RestControllerBase;
import com.giyun.test.dto.BoardDto;
import com.giyun.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController extends RestControllerBase {

    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public String findBoard(@RequestParam(value = "keyword", required = false) String keyword){
        List<BoardDto> boards = boardService.findBoard(keyword);
        return createSuccess(boards);
    }
}
