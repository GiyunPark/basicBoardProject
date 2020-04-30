package com.giyun.test.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Setter
@Getter
public class BoardDto {

    private String boardId;
    private String title;
    private String writer;
    private String contents;
    private Date created_at;
    private Date updated_at;
    private int count;
    private String userId;

}
