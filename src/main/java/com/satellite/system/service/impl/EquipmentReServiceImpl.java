package com.satellite.system.service.impl;

import com.satellite.system.bean.TEquipmentRe;
import com.satellite.system.mapper.EquipmentReMapper;
import com.satellite.system.service.EquipmentReService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:34 2019/3/23
 * @Modified By:
 */
public class EquipmentReServiceImpl implements EquipmentReService{

    @Autowired
    EquipmentReMapper reMapper;
    @Override
    public List<TEquipmentRe> queryDeviceRelation(Integer satelliteId) {
        List<TEquipmentRe> list = reMapper.queryDeviceRelation(satelliteId);
        return list;
    }
}
