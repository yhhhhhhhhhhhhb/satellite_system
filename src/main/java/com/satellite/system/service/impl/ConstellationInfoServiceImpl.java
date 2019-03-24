package com.satellite.system.service.impl;

import com.satellite.system.bean.TConstellationInfo;
import com.satellite.system.mapper.ConstellationInfoMapper;
import com.satellite.system.service.ConstellationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 17:25 2019/3/23
 * @Modified By:
 */
@Service
public class ConstellationInfoServiceImpl implements ConstellationInfoService{

    @Autowired
    ConstellationInfoMapper constellationInfoMapper;

    @Override
    public List<TConstellationInfo> getAllList() {
        List<TConstellationInfo> list = constellationInfoMapper.getAllInfo();
        return list;
    }

    @Override
    public List<TConstellationInfo> getListById(String number) {
        List<TConstellationInfo> list = constellationInfoMapper.getListById(number);
        return list;
    }

    @Override
    public Integer addTConstellationInfo(TConstellationInfo tConstellationInfo) {
        Integer affect = constellationInfoMapper.addConstellationInfo(tConstellationInfo);
        return affect;
    }

    @Override
    public Integer updateTConstellationInfo(TConstellationInfo tConstellationInfo) {
        Integer affect = constellationInfoMapper.updateConstellationInfo(tConstellationInfo);
        return affect;
    }

    @Override
    public Integer deletcTConstellationInfo(String id) {
        Integer affect = constellationInfoMapper.deleteConstellationInfo(id);
        return affect;
    }
}
