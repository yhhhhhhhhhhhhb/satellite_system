package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TLog;
import com.satellite.system.bean.TUser;
import com.satellite.system.bean.TUserDict;
import com.satellite.system.model.User;
import com.satellite.system.service.LogService;
import com.satellite.system.service.UserDictService;
import com.satellite.system.service.UserService;
import com.satellite.system.util.CommonUtil;
import com.satellite.system.util.JsonResult;
import com.satellite.system.util.JwtUtil;
import org.apache.commons.lang3.StringUtils;
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

    @Autowired
    LogService logService;

    @Autowired
    UserDictService userDictService;

    @RequestMapping("/login")
    public JSONObject login(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String userName = (String) map_recv.get("userName");
            String password = (String) map_recv.get("password");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            Integer count = userService.login(userName,password);
            Map<String,Object> map = new HashMap<>();
            map.put("isLogin",count);
            if(count>0){
                String token = JwtUtil.createToken(userName);
                map.put("token",token);
                TUserDict userDict = new TUserDict(userName,token,new Date());
                userDictService.addToken(userDict);
                TLog log = new TLog(new Date(),"登录模块",12000,userName+"登录成功！");
                logService.addLog(log);
            }else {
                TLog log = new TLog(new Date(),"登录模块",12000,userName+"登录失败！");
                logService.addLog(log);
            }
            JSONObject json_send = JsonResult.buildSuccess(map);
            logger.info("token:"+ JwtUtil.createToken(userName));
            return json_send;
        } catch (Exception e) {
            logger.error("登录失败！",e);
            return JsonResult.buildFaild("登录失败！");
        }
    }

    @RequestMapping("/exit")
    public JSONObject exit(HttpServletRequest request, HttpServletResponse response) {
        JSONObject json_send = null;
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String userName = (String) map_recv.get("userName");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            json_send = JsonResult.buildSuccess("退出成功");
            response.setHeader("Access-Control-Allow-Origin", "*");
            TLog log = new TLog(new Date(),"登录模块",12001,userName+"退出！");
            logService.addLog(log);
            userDictService.deleteUserDict(userName);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildSuccess("退出失败");
        }
    }

    @RequestMapping("/queryUsers")
    public JSONObject getAllUser(HttpServletRequest request, HttpServletResponse response){
        if(response.getStatus()==401){
            return JsonResult.buildFaild("token校验失败");
        }
        Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
        logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
        List<User> users = userService.getAllUser();
        JSONObject json_send = JsonResult.buildSuccess(users);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return json_send;
    }

    @RequestMapping("/editUsers")
    public JSONObject editUsers(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String id = map_recv.get("id")==null?"":(String)map_recv.get("id");
            String userName = map_recv.get("userName")==null?"":(String)map_recv.get("userName");
            String password =  map_recv.get("password")==null?"":(String) map_recv.get("password");
            String permission = map_recv.get("permission")==null?"":(String) map_recv.get("permission");
            if(StringUtils.isBlank(id)||StringUtils.isBlank(userName)||StringUtils.isBlank(password)||StringUtils.isBlank(permission)){
                return JsonResult.buildFaild("请传正确的参数！");
            }
            TUser user = new TUser();
            user.setId(Integer.parseInt(id));
            user.setUsername(userName);
            user.setPassword(password);
            user.setRole(Integer.parseInt(permission));
            user.setCreate_time(new Date());
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            Integer affect = userService.updateUser(user);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (NumberFormatException e) {
            logger.error("",e);
            return JsonResult.buildFaild("编辑用户信息失败！");
        }
    }

    @RequestMapping("/deleteUsers")
    public JSONObject deleteUsers(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String userName = (String) map_recv.get("userName");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            Integer affect = userService.deleteUser(userName);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("删除用户信息失败！");
        }
    }

    @RequestMapping("/addUsers")
    public JSONObject addUsers(HttpServletRequest request, HttpServletResponse response){
        try {
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
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("新增用户失败");
        }
    }


}
