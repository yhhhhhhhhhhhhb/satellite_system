package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TEquipmentRe;
import com.satellite.system.service.EquipmentReService;
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
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:36 2019/3/23
 * @Modified By:
 */
@RestController
public class EquipmentReController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EquipmentReService equipmentReService;

    @RequestMapping("/queryDeviceRelation")
    public JSONObject queryDeviceRelation(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            String satellited = map_recv.get("satelliteId")==null?"":(String)map_recv.get("satelliteId");
            if(StringUtils.isBlank(satellited)){
                return JsonResult.buildFaild("参数未传正确");
            }
            List<TEquipmentRe> list = equipmentReService.queryDeviceRelation(Integer.parseInt(satellited));
            JSONObject json_send = JsonResult.buildSuccess(list);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("查询设备关系失败！");
        }
    }

}
