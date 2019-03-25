package com.satellite.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.satellite.system.util.CommonUtil;
import com.satellite.system.util.JsonResult;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.UUID;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 21:59 2019/3/23
 * @Modified By:
 */
@RestController
public class FileHandleController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 参数例子：http://localhost:8666/downloadData?url=C:%5CUsers%5C58-Licht%5CDesktop%5Cgio%5Cdemo.xlsx
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/downloadData")
    public JSONObject updateGroundStation(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> map_recv = CommonUtil.getParameterMap(request);
            logger.info(">>> recv: ip="+request.getRemoteAddr()+", "+ request.getRequestURI()+", "+map_recv);
            String downloadFilePath = (String) map_recv.get("url");
            //String downloadFilePath = "C:\\Users\\58-Licht\\Desktop\\gio\\demo.xlsx";//被下载的文件在服务器中的路径,
            String fileName = "demo.xlsx";//被下载文件的名称
            File file = new File(downloadFilePath);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开            
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream outputStream = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        outputStream.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            logger.error("",e);
            return JsonResult.buildFaild("下载失败，请联系管理员");
        }
    }


    @RequestMapping("/uploadData")
    public String updateGroundStation(@RequestParam("uploadFile")MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        String filePath = "C:\\Users\\58-Licht\\Desktop\\gio\\";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            logger.info("上传成功");
            return "上传成功";
        } catch (IOException e) {
            logger.error(e.toString(), e);
        }
        return "上传失败！";
    }


}
