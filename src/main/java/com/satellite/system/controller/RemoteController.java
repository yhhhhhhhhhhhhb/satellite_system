package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.bean.TRemote;
import com.satellite.system.bean.TTaskAllocation;
import com.satellite.system.service.RemoteService;
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
 * @Date: Created in 11:01 2019/3/23
 * @Modified By:
 */
@RestController
public class RemoteController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RemoteService remoteService;

    @RequestMapping("/queryTelecontrlContent")
    public JSONObject queryTelecontrlContent(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            String ids = (String) map_recv.get("taskID");
            if(StringUtils.isBlank(ids)){
                return JsonResult.buildFaild("未传参数");
            }
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            List<TRemote> remotes = remoteService.queryTelecontrolContent(ids);
            JSONObject json_send = JsonResult.buildSuccess(remotes);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return json_send;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("遥控内容查询失败，请联系管理员！");
        }
    }
}
