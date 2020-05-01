package com.giyun.test.common;

import com.giyun.test.dto.PageDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse <T>{
    private int result;
    private T data;
    private PageDto pageInfo;
    private Integer total;
    private String reason;
}
