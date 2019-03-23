package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TConstellationInfo;
import com.satellite.system.bean.TSatelliteInfo;
import com.satellite.system.service.ConstellationInfoService;
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
 * @Date: Created in 17:25 2019/3/23
 * @Modified By:
 */
@RestController
public class ConstellationInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ConstellationInfoService constellationInfoService;

    @RequestMapping("/queryConstellationList")
    public JSONObject queryConstellationList(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            List<TConstellationInfo> constellationInfos = constellationInfoService.getAllList();
            JSONObject json_send = JsonResult.buildSuccess(constellationInfos);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("查询星座失败，请联系管理员！");
        }
    }

    @RequestMapping("/queryConstellation")
    public JSONObject queryConstellation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String number = (String) map_recv.get("constellationId");
            List<TConstellationInfo> constellationInfos = constellationInfoService.getListById(number);
            JSONObject json_send = JsonResult.buildSuccess(constellationInfos);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("查询星座失败，请联系管理员！");
        }
    }

    @RequestMapping("/addConstellation")
    public JSONObject addConstellation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String number = (String) map_recv.get("constellationId");
            String constellationName = (String) map_recv.get("constellationName");
            Integer constellationType = (Integer) map_recv.get("constellationType");
            String constellationOwners = (String) map_recv.get("constellationOwners");
            TConstellationInfo constellationInfo = new TConstellationInfo(number,constellationName,constellationType,constellationOwners);
            Integer affect = constellationInfoService.addTConstellationInfo(constellationInfo);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("新增星座信息失败，请联系管理员！");
        }
    }

    @RequestMapping("/updateConstellation")
    public JSONObject updateConstellation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String number = (String) map_recv.get("constellationId");
            String constellationName = (String) map_recv.get("constellationName");
            Integer constellationType = (Integer) map_recv.get("constellationType");
            String constellationOwners = (String) map_recv.get("constellationOwners");
            TConstellationInfo constellationInfo = new TConstellationInfo(number,constellationName,constellationType,constellationOwners);
            Integer affect = constellationInfoService.updateTConstellationInfo(constellationInfo);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("新增星座信息失败，请联系管理员！");
        }
    }

    @RequestMapping("/deleteConstellation")
    public JSONObject deleteConstellation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String number = (String) map_recv.get("constellationId");
            Integer affect = constellationInfoService.deletcTConstellationInfo(number);
            JSONObject json_send = JsonResult.buildSuccess(affect);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("删除星座信息失败，请联系管理员！");
        }
    }
}
