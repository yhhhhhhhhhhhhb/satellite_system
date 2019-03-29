package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TTaskAllocation;
import com.satellite.system.service.TaskAllocationService;
import com.satellite.system.util.CommonUtil;
import com.satellite.system.util.DateUtil;
import com.satellite.system.util.JsonResult;
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
            Integer satelliteNum = Integer.parseInt((String) map_recv.get("satelliteId"));
            Integer taskType = Integer.parseInt((String) map_recv.get("taskType"));
            String planStartTime = (String) map_recv.get("planStartTime");
            String planEndTime = (String)map_recv.get("planEndTime");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            TTaskAllocation tTaskAllocation = new TTaskAllocation(stationNum,satelliteNum,taskType, DateUtil.strToDate(planStartTime),DateUtil.strToDate(planEndTime));
            Integer afect = taskAllocationService.addTaskAssignment(tTaskAllocation);
            JSONObject json_send = JsonResult.buildSuccess(afect);
            response.setHeader("Access-Control-Allow-cancelTaskOrigin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("新增任务失败！");
        }
    }

    @RequestMapping("/cancelTask")
    public JSONObject cancelTask(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String taskIDs = (String) map_recv.get("taskID");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            Integer affect = taskAllocationService.cancelTask(taskIDs);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("撤回任务失败！");
        }
    }

    @RequestMapping("/queryTaskAssignment")
    public JSONObject queryTaskAssignment(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String stationNum = "";
            Integer satelliteNum = null;
            Integer taskType = null;
            Date planStartTime = null;
            Date planEndTime = null;
            if(StringUtils.isNotBlank((String) map_recv.get("groundId"))){
                stationNum = (String) map_recv.get("groundId");
            }
            if(StringUtils.isNotBlank((String) map_recv.get("satelliteId"))){
                satelliteNum = Integer.parseInt((String) map_recv.get("satelliteId"));
            }
            if(StringUtils.isNotBlank((String) map_recv.get("taskType"))){
                taskType = Integer.parseInt((String)map_recv.get("taskType"));
            }
            if(StringUtils.isNotBlank((String) map_recv.get("planStartTime"))){
                planStartTime = DateUtil.strToDate((String) map_recv.get("planStartTime"));
            }
            if(StringUtils.isNotBlank((String) map_recv.get("planEndTime"))){
                planEndTime = DateUtil.strToDate((String)map_recv.get("planEndTime"));
            }
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            TTaskAllocation tTaskAllocation = new TTaskAllocation(stationNum,satelliteNum,taskType,planStartTime,planEndTime);
            List<TTaskAllocation> list =  taskAllocationService.queryTaskAssignment(tTaskAllocation);
            JSONObject json_send = JsonResult.buildSuccess(list);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("查询任务失败！");
        }
    }
}
