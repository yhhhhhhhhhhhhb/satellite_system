package com.satellite.system.util;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 0:08 2019/3/21
 * @Modified By:
 */
public enum CodeEnum {
    SUCCESS(200,"成功"),
    ERRAE(500,"错误");

    private Integer code;
    private String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
