package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TUser;
import com.satellite.system.service.UserService;
import com.satellite.system.util.CommonUtil;
import com.satellite.system.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 17:03 2018/7/21
 * @Modified By:
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @RequestMapping("/getById")
    public JSONObject getById(HttpServletRequest request, HttpServletResponse response) {
        long startTime=System.currentTimeMillis();
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String id = (String) map_recv.get("id");
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        TUser user = userService.getUserById(Integer.parseInt(id));
        JSONObject json_send = JsonResult.buildSuccess(user);
        response.setHeader("Access-Control-Allow-Origin", "*");
        long endTime=System.currentTimeMillis();
        float excTime=(float)(endTime-startTime);
        json_send.put("lapse", excTime+" ms");
        logger.info(">>> send: ip="+request.getRemoteAddr()+", "+request.getRequestURI()+", lapse="+excTime+"ms, " +json_send);
        return json_send;
    }
    @RequestMapping("/getByName")
    public JSONObject getByName(HttpServletRequest request, HttpServletResponse response) {
        long startTime=System.currentTimeMillis();
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String name = (String) map_recv.get("name");
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        List<Map<String ,Object>> mapList = userService.getListMyName(name);
        response.setHeader("Access-Control-Allow-Origin", "*");
        long endTime=System.currentTimeMillis();
        float excTime=(float)(endTime-startTime);
        JSONObject json_send = JsonResult.buildSuccess(mapList);
        //json_send.put("lapse", excTime+" ms");
        //logger.info(">>> send: ip="+request.getRemoteAddr()+", "+request.getRequestURI()+", lapse="+excTime+"ms, " +json_send);
        return json_send;
    }

}
