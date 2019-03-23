package com.satellite.system.service.impl;

import com.satellite.system.bean.TSatelliteInfo;
import com.satellite.system.mapper.SatelliteInfoMapper;
import com.satellite.system.service.SatelliteInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:04 2019/3/23
 * @Modified By:
 */
public class SatelliteInfoServiceImpl  implements SatelliteInfoService{

    @Autowired
    SatelliteInfoMapper satelliteInfoMapper;

    @Override
    public List<TSatelliteInfo> getDownListByTaskId(String ids) {
        List<TSatelliteInfo> list = satelliteInfoMapper.getDownListByTaskId(ids);
        return list;
    }

    @Override
    public List<TSatelliteInfo> getAllInfo() {
        List<TSatelliteInfo> list = satelliteInfoMapper.getAllInfo();
        return list;
    }

    @Override
    public Integer addSatelliteInfo(TSatelliteInfo satelliteInfo) {
        Integer affect = satelliteInfoMapper.addSatellilte(satelliteInfo);
        return affect;
    }

    @Override
    public Integer deleteSatelliteInfo(String satelliteId) {
        Integer affect = satelliteInfoMapper.deleteSatellite(satelliteId);
        return affect;
    }

    @Override
    public Integer updateSatelliteInfo(TSatelliteInfo satelliteInfo) {
        Integer affect = satelliteInfoMapper.updateSatellilte(satelliteInfo);
        return affect;
    }

    @Override
    public List<TSatelliteInfo> getAllSatellitesBycon(String constellationId) {
        List<TSatelliteInfo> list = satelliteInfoMapper.getAllSatellitesBycon(constellationId);
        return list;
    }
}
