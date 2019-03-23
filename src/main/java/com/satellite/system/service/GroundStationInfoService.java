package com.satellite.system.service;

import com.satellite.system.bean.TGroundStationInfo;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:40 2019/3/23
 * @Modified By:
 */
public interface GroundStationInfoService {

    List<TGroundStationInfo> getAllInfo();

    Integer addGroundStationInfo(TGroundStationInfo groundStationInfo);

    Integer deleteGroundStationInfo(String groundId);

    Integer updateGroundStationInfo(TGroundStationInfo groundStationInfo);
}
