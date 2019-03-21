package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TUser;
import com.satellite.system.model.User;
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
import java.util.Date;
import java.util.HashMap;
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

    @RequestMapping("/login")
    public JSONObject getById(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String userName = (String) map_recv.get("userName");
        String password = (String) map_recv.get("password");
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        Integer count = userService.login(userName,password);
        Map<String,Integer> map = new HashMap<>();
        map.put("isLogin",count);
        JSONObject json_send = JsonResult.buildSuccess(map);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }

    @RequestMapping("/exit")
    public JSONObject exit(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String userName = (String) map_recv.get("userName");
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        JSONObject json_send = JsonResult.buildSuccess("");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }

    @RequestMapping("/queryUsers")
    public JSONObject getAllUser(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        List<User> users = userService.getAllUser();
        JSONObject json_send = JsonResult.buildSuccess(users);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }

    @RequestMapping("/editUsers")
    public JSONObject editUsers(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String id = (String)map_recv.get("id");
        String userName = (String) map_recv.get("userName");
        String password = (String) map_recv.get("password");
        String permission = (String) map_recv.get("permission");
        TUser user = new TUser();
        user.setId(Integer.parseInt(id));
        user.setUsername(userName);
        user.setPassword(password);
        user.setRole(Integer.parseInt(permission));
        user.setCreate_time(new Date());
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        userService.updateUser(user);
        JSONObject json_send = JsonResult.buildSuccess("");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }

    @RequestMapping("/deleteUsers")
    public JSONObject deleteUsers(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String userName = (String) map_recv.get("userName");
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        userService.deleteUser(userName);
        JSONObject json_send = JsonResult.buildSuccess("");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }

    @RequestMapping("/addUsers")
    public JSONObject addUsers(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        String userName = (String) map_recv.get("userName");
        String password = (String) map_recv.get("password");
        String permission = (String) map_recv.get("permission");
        TUser user = new TUser();
        user.setUsername(userName);
        user.setPassword(password);
        user.setRole(Integer.parseInt(permission));
        user.setCreate_time(new Date());
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        Integer i = userService.addUser(user);
        JSONObject json_send = JsonResult.buildSuccess(i);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }


}
