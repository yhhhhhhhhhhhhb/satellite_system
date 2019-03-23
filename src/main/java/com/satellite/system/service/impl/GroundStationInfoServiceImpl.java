package com.satellite.system.service.impl;

import com.satellite.system.bean.TGroundStationInfo;
import com.satellite.system.mapper.GroundStationInfoMapper;
import com.satellite.system.service.GroundStationInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:40 2019/3/23
 * @Modified By:
 */
public class GroundStationInfoServiceImpl implements GroundStationInfoService{
    @Autowired
    GroundStationInfoMapper groundStationInfoMapper;

    @Override
    public List<TGroundStationInfo> getAllInfo() {
        List<TGroundStationInfo> list = groundStationInfoMapper.getAllInfo();
        return list;
    }

    @Override
    public Integer addGroundStationInfo(TGroundStationInfo groundStationInfo) {
        Integer i = groundStationInfoMapper.addGroundStationInfo(groundStationInfo);
        return i;
    }

    @Override
    public Integer deleteGroundStationInfo(String groundId) {
        Integer integer =groundStationInfoMapper.deleteGroundStationInfo(groundId);
        return integer;
    }

    @Override
    public Integer updateGroundStationInfo(TGroundStationInfo groundStationInfo) {
        Integer i = groundStationInfoMapper.updateGroundStationInfo(groundStationInfo);
        return i;
    }
}
