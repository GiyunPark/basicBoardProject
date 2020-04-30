package com.giyun.test.mapper;

import com.giyun.test.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
@Mapper
public interface BoardMapper {

    public List<BoardDto> selectBoard(Map<String, Object> params);
}
