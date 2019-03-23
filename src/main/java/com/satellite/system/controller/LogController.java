package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TLog;
import com.satellite.system.bean.TTaskAllocation;
import com.satellite.system.service.LogService;
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
import java.util.List;
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 19:08 2019/3/22
 * @Modified By:
 */
@RestController
public class LogController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LogService logService;

    @RequestMapping("/queryLog")
    public JSONObject queryLog(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            Date time1 = (Date) map_recv.get("time1");
            Date time2 = (Date) map_recv.get("time2");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            List<TLog> tLogs = logService.queryLog(time1,time2);
            JSONObject json_send = JsonResult.buildSuccess(tLogs);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("查询日志失败！");
        }
    }

    @RequestMapping("/deleteLog")
    public JSONObject deleteLog(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            Date time1 = (Date) map_recv.get("time1");
            Date time2 = (Date) map_recv.get("time2");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            Integer affect = logService.deleteLog(time1,time2);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("删除日志失败！");
        }
    }
}
