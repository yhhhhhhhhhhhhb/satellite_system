package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TGroundStationInfo;
import com.satellite.system.service.GroundStationInfoService;
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
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:42 2019/3/23
 * @Modified By:
 */
@RestController
public class GroundStationInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GroundStationInfoService groundStationInfoService;

    @RequestMapping("/queryGroundStation")
    public JSONObject queryGroundStation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            List<TGroundStationInfo> list = groundStationInfoService.getAllInfo();
            JSONObject json_send = JsonResult.buildSuccess(list);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("查询地面站信息失败！");
        }
    }

    @RequestMapping("/addGroundStation")
    public JSONObject addGroundStation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            String number = map_recv.get("groundId")==null?"":(String) map_recv.get("groundId");
            String groundName =  map_recv.get("groundName")==null?"":(String) map_recv.get("groundName");
            String groundType =  map_recv.get("groundType")==null?"":(String) map_recv.get("groundType");
            String groundTelementryFre =  map_recv.get("groundTelementryFre")==null?"":(String) map_recv.get("groundTelementryFre");
            String groundTelemetryGain =  map_recv.get("groundTelemetryGain")==null?"":(String) map_recv.get("groundTelemetryGain");
            String groundTelecontrolFre = map_recv.get("groundTelecontrolFre")==null?"":(String) map_recv.get("groundTelecontrolFre");
            String groundTelecontrolErp = map_recv.get("groundTelecontrolErp")==null?"":(String) map_recv.get("groundTelecontrolErp");
            String dataDownFre =  map_recv.get("dataDownFre")==null?"":(String) map_recv.get("dataDownFre");
            String dataDownGain = map_recv.get("dataDownGain")==null?"":(String) map_recv.get("dataDownGain");
            String dataUpFre =  map_recv.get("dataUpFre")==null?"":(String) map_recv.get("dataUpFre");
            String dateUpErp =  map_recv.get("dataUpErp")==null?"":(String) map_recv.get("dataUpErp");
            String lon =  map_recv.get("lon")==null?"":(String) map_recv.get("lon");
            String lat =  map_recv.get("lat")==null?"":(String) map_recv.get("lat");
            String ip =  map_recv.get("ip")==null?"":(String) map_recv.get("ip");
            BigDecimal lonb = BigDecimal.valueOf(0L);
            BigDecimal latb = BigDecimal.valueOf(0L);
            if(StringUtils.isNotBlank(lon)){
                 lonb = new BigDecimal(lon);
            }
            if(StringUtils.isNotBlank(lat)){
                 latb = new BigDecimal(lat);
            }
            TGroundStationInfo tGroundStationInfo = new TGroundStationInfo(number,groundName,groundType,groundTelementryFre,groundTelemetryGain,groundTelecontrolFre,groundTelecontrolErp,dataDownFre,dataDownGain,dataUpFre,dateUpErp,lonb,latb,ip);
            Integer i = groundStationInfoService.addGroundStationInfo(tGroundStationInfo);
            response.setHeader("Access-Control-Allow-Origin", "*");
            JSONObject json_send = JsonResult.buildSuccess(i);
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("新增地面站信息失败！");
        }
    }

    @RequestMapping("/deleteGroundStation")
    public JSONObject deleteGroundStation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String number = (String) map_recv.get("groundId");
            Integer integer = groundStationInfoService.deleteGroundStationInfo(number);
            JSONObject json_send = JsonResult.buildSuccess(integer);
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("删除地面站信息失败");
        }
    }

    @RequestMapping("/updateGroundStation")
    public JSONObject updateGroundStation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            response.setHeader("Access-Control-Allow-Origin", "*");
            String number = map_recv.get("groundId")==null?"":(String) map_recv.get("groundId");
            String groundName =  map_recv.get("groundName")==null?"":(String) map_recv.get("groundName");
            String groundType =  map_recv.get("groundType")==null?"":(String) map_recv.get("groundType");
            String groundTelementryFre =  map_recv.get("groundTelementryFre")==null?"":(String) map_recv.get("groundTelementryFre");
            String groundTelemetryGain =  map_recv.get("groundTelemetryGain")==null?"":(String) map_recv.get("groundTelemetryGain");
            String groundTelecontrolFre = map_recv.get("groundTelecontrolFre")==null?"":(String) map_recv.get("groundTelecontrolFre");
            String groundTelecontrolErp = map_recv.get("groundTelecontrolErp")==null?"":(String) map_recv.get("groundTelecontrolErp");
            String dataDownFre =  map_recv.get("dataDownFre")==null?"":(String) map_recv.get("dataDownFre");
            String dataDownGain = map_recv.get("dataDownGain")==null?"":(String) map_recv.get("dataDownGain");
            String dataUpFre =  map_recv.get("dataUpFre")==null?"":(String) map_recv.get("dataUpFre");
            String dateUpErp =  map_recv.get("dataUpErp")==null?"":(String) map_recv.get("dataUpErp");
            String lon =  map_recv.get("lon")==null?"":(String) map_recv.get("lon");
            String lat =  map_recv.get("lat")==null?"":(String) map_recv.get("lat");
            String ip =  map_recv.get("ip")==null?"":(String) map_recv.get("ip");
            BigDecimal lonb = BigDecimal.valueOf(0L);
            BigDecimal latb = BigDecimal.valueOf(0L);
            if(StringUtils.isNotBlank(lon)){
                lonb = new BigDecimal(lon);
            }
            if(StringUtils.isNotBlank(lat)){
                latb = new BigDecimal(lat);
            }
            TGroundStationInfo tGroundStationInfo = new TGroundStationInfo(number,groundName,groundType,groundTelementryFre,groundTelemetryGain,groundTelecontrolFre,groundTelecontrolErp,dataDownFre,dataDownGain,dataUpFre,dateUpErp,lonb,latb,ip);
            Integer i = groundStationInfoService.updateGroundStationInfo(tGroundStationInfo);
            JSONObject json_send = JsonResult.buildSuccess(i);
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("更新地面站信息失败！");
        }
    }
}
