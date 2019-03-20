package com.satellite.system.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 16:51 2018/4/15
 * @Modified By:
 */
public class JsonResult {

    /**
     * 成功返回
     * @param data
     * @return
     */
    public static JSONObject  buildSuccess(Object data){
        JSONObject json_send = new JSONObject();
        json_send.put("code", CodeEnum.SUCCESS.getCode());
        json_send.put("message", CodeEnum.SUCCESS.getMessage());
        json_send.put("data", data);
        return json_send;
    }

    /**
     * 失败返回
     * @param data
     * @return
     */
    public static JSONObject buildFaild(Object data){
        JSONObject json_send = new JSONObject();
        json_send.put("code", CodeEnum.ERRAE.getCode());
        json_send.put("message", CodeEnum.ERRAE.getMessage());
        json_send.put("data", data);
        return json_send;
    }
}
