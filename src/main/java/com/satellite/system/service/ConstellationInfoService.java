package com.satellite.system.service;

import com.satellite.system.bean.TConstellationInfo;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 17:25 2019/3/23
 * @Modified By:
 */
public interface ConstellationInfoService {

    List<TConstellationInfo> getAllList();

    List<TConstellationInfo> getListById(String number);

    Integer addTConstellationInfo(TConstellationInfo tConstellationInfo);

    Integer updateTConstellationInfo(TConstellationInfo tConstellationInfo);

    Integer deletcTConstellationInfo(String id);
}
