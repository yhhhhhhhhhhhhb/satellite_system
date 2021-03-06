package com.satellite.system.service.impl;

import com.satellite.system.bean.TLog;
import com.satellite.system.mapper.LogMapper;
import com.satellite.system.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 18:48 2019/3/22
 * @Modified By:
 */
@Service
public class LogServiceImpl implements LogService{

    @Autowired
    LogMapper logMapper;

    @Override
    public List<TLog> queryLog(String time1, String time2) {
        List<TLog> tLogs = logMapper.getLogsByTime(time1,time2);
        return tLogs;
    }

    @Override
    public Integer deleteLog(String time1, String time2) {
        Integer i = logMapper.deleteLog(time1,time2);
        return i;
    }

    @Override
    public Integer addLog(TLog log) {
        Integer i = logMapper.addLog(log);
        return i;
    }
}
