package com.giyun.test.controller;

import com.giyun.test.common.RestControllerBase;
import com.giyun.test.dto.BoardDto;
import com.giyun.test.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BoardController extends RestControllerBase {

    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public String findBoard(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "start", required = false) Integer start,
            @RequestParam(value = "size", required = false) Integer size
    ){
        start = (start != null && start > 0) ? start : DEFAULT_PAGING_START;
        size = (size != null && size > 0) ? size : DEFAULT_PAGING_SIZE;
        try {
            List<BoardDto> boards = boardService.findBoard(keyword, start, size);
            int total = boardService.findBoardCount(keyword);
            return createSuccessForPaging(boards, total, start, size);
        }catch (Throwable e){
            System.out.println("eeeee" + e);
            return log.isDebugEnabled() ? createFail(e) : createFail("server error.");
        }

    }
}
