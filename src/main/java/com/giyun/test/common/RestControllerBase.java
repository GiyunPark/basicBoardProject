package com.giyun.test.common;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class RestControllerBase {

    @Autowired
    private Gson gson;

    static private final int SUCCESS = 1;

    protected <T> String createSuccess(T value){
        ApiResponse<T> response = new ApiResponse<T>();
        response.setResult(SUCCESS);
        response.setData(value);
        return gson.toJson(response);
    }
}
