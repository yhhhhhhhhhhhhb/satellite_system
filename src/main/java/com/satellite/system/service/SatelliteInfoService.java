package com.satellite.system.service;

import com.satellite.system.bean.TGroundStationInfo;
import com.satellite.system.bean.TSatelliteInfo;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:04 2019/3/23
 * @Modified By:
 */
public interface SatelliteInfoService {

    List<TSatelliteInfo> getDownListByTaskId(String ids);

    List<TSatelliteInfo> getAllInfo();

    Integer addSatelliteInfo(TSatelliteInfo satelliteInfo);

    Integer deleteSatelliteInfo(String satelliteId);

    Integer updateSatelliteInfo(TSatelliteInfo satelliteInfo);

    List<TSatelliteInfo> getAllSatellitesBycon (String constellationId);
}
