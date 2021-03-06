package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TRemote;
import com.satellite.system.bean.TSatelliteInfo;
import com.satellite.system.service.SatelliteInfoService;
import com.satellite.system.util.CommonUtil;
import com.satellite.system.util.JsonResult;
import org.apache.commons.lang3.StringUtils;
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
 * @Date: Created in 13:30 2019/3/23
 * @Modified By:
 */
@RestController
public class SatelliteInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SatelliteInfoService satelliteInfoService;

    @RequestMapping("/queryDownRecord")
    public JSONObject queryDownRecord(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String ids = (String) map_recv.get("taskID");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            List<TSatelliteInfo> satelliteInfos = satelliteInfoService.getDownListByTaskId(ids);
            JSONObject json_send = JsonResult.buildSuccess(satelliteInfos);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("下行数据失败",e);
            return JsonResult.buildFaild("下行数据查询失败，请联系管理员！");
        }
    }

    @RequestMapping("/queryDownData")
    public JSONObject queryDownData(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String ids = (String) map_recv.get("taskID");
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            List<TSatelliteInfo> satelliteInfos = satelliteInfoService.getDownListByTaskId(ids);
            JSONObject json_send = JsonResult.buildSuccess(satelliteInfos);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("上行数据查询失败，请联系管理员！");
        }
    }

    @RequestMapping("/querySatellite")
    public JSONObject querySatellite(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            List<TSatelliteInfo> satelliteInfos = satelliteInfoService.getAllInfo();
            JSONObject json_send = JsonResult.buildSuccess(satelliteInfos);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("卫星信息查询失败，请联系管理员！");
        }
    }
    @RequestMapping("/addSatellite")
    public JSONObject addSatellite(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String satelliteId = (String) map_recv.get("satelliteId");
            String nasaId = (String) map_recv.get("nasaId");
            String satelliteName = (String) map_recv.get("satelliteName");
            String constellationId = (String) map_recv.get("constellationId");
            String satelliteType = (String) map_recv.get("satelliteType");
            String telemetryFre = (String) map_recv.get("telemetryFre");
            String telemetryErp = (String) map_recv.get("telemetryErp");
            String telecontrolFre = (String) map_recv.get("telecontrolFre");
            String telecontrolGain = (String) map_recv.get("telecontrolGain");
            String dataDownFre = (String) map_recv.get("dataDownFre");
            String dataDownErp = (String) map_recv.get("dataDownErp");
            String dataUpFre = (String) map_recv.get("dataUpFre");
            String dataUpGain = (String) map_recv.get("dataUpGain");
            String businessDownFre = (String) map_recv.get("businessDownFre");
            String businessDownErp = (String) map_recv.get("businessDownErp");
            String businessUpFre = (String) map_recv.get("businessUpFre");
            String businessUpGain = (String) map_recv.get("businessUpGain");
            Float dipAngle = 0f;
            Float chek = 0f;
            Float eccentricity = 0f;
            Float semiMajorAxis = 0f;
            Float perigeeAngle = 0f;
            Float perigeeTime = 0f;
            if(map_recv.get("dipAngle")!=null){
                dipAngle = Float.parseFloat((String) map_recv.get("dipAngle"));
            }
            if( map_recv.get("chek")!=null){
                chek = Float.parseFloat((String) map_recv.get("chek"));
            }
            if(map_recv.get("eccentricity")!=null){
                eccentricity = Float.parseFloat((String) map_recv.get("eccentricity"));
            }
            if(map_recv.get("semiMajorAxis")!=null){
                semiMajorAxis = Float.parseFloat((String)map_recv.get("semiMajorAxis") );
            }
            if(map_recv.get("perigeeAngle")!=null){
                perigeeAngle = Float.parseFloat((String) map_recv.get("perigeeAngle"));
            }
            if(map_recv.get("perigeeTime")!=null){
                perigeeTime = Float.parseFloat((String) map_recv.get("perigeeTime"));
            }
            TSatelliteInfo tSatelliteInfo = new TSatelliteInfo(satelliteId,nasaId,satelliteName,constellationId,satelliteType,telemetryFre,telemetryErp,telecontrolFre,telecontrolGain,dataDownFre,dataDownErp,dataUpFre,dataUpGain,businessDownFre,businessDownErp,businessUpFre,businessUpGain,dipAngle,chek,eccentricity,semiMajorAxis,perigeeAngle,perigeeTime);
            Integer i = satelliteInfoService.addSatelliteInfo(tSatelliteInfo);
            JSONObject json_send = JsonResult.buildSuccess(i);
            return json_send;
        }catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("卫星信息新增失败，请联系管理员！");
        }
    }

    @RequestMapping("/deleteSatellite")
    public JSONObject deleteSatellite(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String satelliteId = (String) map_recv.get("satelliteId");
            if(StringUtils.isBlank(satelliteId)){
                return JsonResult.buildFaild("请检查参数！");
            }
            Integer i = satelliteInfoService.deleteSatelliteInfo(satelliteId);
            JSONObject json_send = JsonResult.buildSuccess(i);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("卫星信息查询失败，请联系管理员！");
        }
    }

    @RequestMapping("/updateSatellite")
    public JSONObject updateSatellite(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String satelliteId = (String) map_recv.get("satelliteId");
            String nasaId = (String) map_recv.get("nasaId");
            String satelliteName = (String) map_recv.get("satelliteName");
            String constellationId = (String) map_recv.get("constellationId");
            String satelliteType = (String) map_recv.get("satelliteType");
            String telemetryFre = (String) map_recv.get("telemetryFre");
            String telemetryErp = (String) map_recv.get("telemetryErp");
            String telecontrolFre = (String) map_recv.get("telecontrolFre");
            String telecontrolGain = (String) map_recv.get("telecontrolGain");
            String dataDownFre = (String) map_recv.get("dataDownFre");
            String dataDownErp = (String) map_recv.get("dataDownErp");
            String dataUpFre = (String) map_recv.get("dataUpFre");
            String dataUpGain = (String) map_recv.get("dataUpGain");
            String businessDownFre = (String) map_recv.get("businessDownFre");
            String businessDownErp = (String) map_recv.get("businessDownErp");
            String businessUpFre = (String) map_recv.get("businessUpFre");
            String businessUpGain = (String) map_recv.get("businessUpGain");
            Float dipAngle = Float.parseFloat((String) map_recv.get("dipAngle"));
            Float chek = Float.parseFloat((String) map_recv.get("chek"));
            Float eccentricity = Float.parseFloat((String) map_recv.get("eccentricity"));
            Float semiMajorAxis = Float.parseFloat((String) map_recv.get("semiMajorAxis"));
            Float perigeeAngle = Float.parseFloat((String) map_recv.get("perigeeAngle"));
            Float perigeeTime = Float.parseFloat((String) map_recv.get("perigeeTime"));
            TSatelliteInfo tSatelliteInfo = new TSatelliteInfo(satelliteId,nasaId,satelliteName,constellationId,satelliteType,telemetryFre,telemetryErp,telecontrolFre,telecontrolGain,dataDownFre,dataDownErp,dataUpFre,dataUpGain,businessDownFre,businessDownErp,businessUpFre,businessUpGain,dipAngle,chek,eccentricity,semiMajorAxis,perigeeAngle,perigeeTime);
            Integer i = satelliteInfoService.updateSatelliteInfo(tSatelliteInfo);
            JSONObject json_send = JsonResult.buildSuccess(i);
            return json_send;
        }catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("跟新卫星信息失败，请联系管理员！");
        }
    }

    @RequestMapping("/queryAllSatellitesBycon")
    public JSONObject queryAllSatellitesBycon(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String constellationId = (String) map_recv.get("constellationId");
            List<TSatelliteInfo> satelliteInfos = satelliteInfoService.getAllSatellitesBycon(constellationId);
            JSONObject json_send = JsonResult.buildSuccess(satelliteInfos);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("卫星信息查询失败，请联系管理员！");
        }
    }

}
