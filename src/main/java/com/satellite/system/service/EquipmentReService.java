package com.satellite.system.service;

import com.satellite.system.bean.TEquipmentRe;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:30 2019/3/23
 * @Modified By:
 */
public interface EquipmentReService {

    List<TEquipmentRe> queryDeviceRelation(Integer satelliteId);
}
