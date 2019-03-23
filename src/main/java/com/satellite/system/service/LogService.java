package com.satellite.system.service;

import com.satellite.system.bean.TLog;

import java.util.Date;
import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 18:48 2019/3/22
 * @Modified By:
 */
public interface LogService {


    List<TLog> queryLog(Date time1,Date time2);

    Integer deleteLog(Date time1,Date time2);


}
