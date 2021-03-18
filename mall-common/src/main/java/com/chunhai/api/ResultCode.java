package com.chunhai.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ResultCode implements IErrorCode{
    SUCCESS(200, "操作成功"),
    FAILED(500,"操作失败"),
    PARAM_NOT_VALID(500, "参数不合法"),
    ;
    private long code;
    private String message;
}
