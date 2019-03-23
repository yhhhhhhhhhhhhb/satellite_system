package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TFieldDefinition;
import com.satellite.system.service.FieldDefinitionService;
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
 * @Date: Created in 11:43 2019/3/23
 * @Modified By:
 */
@RestController
public class FieldDefinitionController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FieldDefinitionService fieldDefinitionService;

    @RequestMapping("/queryField")
    public JSONObject queryField(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            Integer satellited = (Integer) map_recv.get("satelliteId");
            List<TFieldDefinition> list = fieldDefinitionService.queryField(satellited);
            JSONObject json_send = JsonResult.buildSuccess(list);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            return JsonResult.buildFaild("查询字段定义表失败！");
        }
    }
}
