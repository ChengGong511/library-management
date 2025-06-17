package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    private String code;
    private String message;
    private Object data;



    //增删改 成功响应
    public static Result success() {
        return new Result(SUCCESS_CODE, "success", null);
    }

    //查询 成功响应
    public static Result success(Object data) {
        return new Result(SUCCESS_CODE, "success", data);
    }

    //失败响应
    public static Result error(String msg) {
        return new Result(ERROR_CODE, msg, null);
    }


}