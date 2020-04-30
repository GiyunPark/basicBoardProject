package com.giyun.test.controller;

import com.giyun.test.common.RestControllerBase;
import com.giyun.test.dto.BoardDto;
import com.giyun.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController extends RestControllerBase {

    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public String findBoard(){
        List<BoardDto> boards = boardService.findBoard();
        return createSuccess(boards);
    }
}
