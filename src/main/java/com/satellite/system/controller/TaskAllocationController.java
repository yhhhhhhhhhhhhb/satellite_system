package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TTaskAllocation;
import com.satellite.system.service.TaskAllocationService;
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
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:25 2019/3/21
 * @Modified By:
 */
@RestController
public class TaskAllocationController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TaskAllocationService taskAllocationService;

    @RequestMapping("/addTaskAssignment")
    public JSONObject addTaskAssignment(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String stationNum = (String) map_recv.get("groundId");
            Integer satelliteNum = (Integer) map_recv.get("satelliteId");
            Integer taskType = (Integer) map_recv.get("taskType");
            Date planStartTime = (Date) map_recv.get("planStartTime");
            Date planEndTime = (Date)map_recv.get("planEndTime");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            TTaskAllocation tTaskAllocation = new TTaskAllocation(stationNum,satelliteNum,taskType,planStartTime,planEndTime);
            taskAllocationService.addTaskAssignment(tTaskAllocation);
            JSONObject json_send = JsonResult.buildSuccess(tTaskAllocation);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("新增任务失败！");
        }
    }

    @RequestMapping("/cancelTask")
    public JSONObject cancelTask(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            Integer taskID = (Integer) map_recv.get("taskId");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            taskAllocationService.cancelTask(taskID);
            Map<String,Integer> map = new HashMap<>();
            map.put("taskId",taskID);
            JSONObject json_send = JsonResult.buildSuccess(map);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("撤回任务失败！");
        }
    }
}
