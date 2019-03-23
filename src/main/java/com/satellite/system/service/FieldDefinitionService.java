package com.satellite.system.service;

import com.satellite.system.bean.TFieldDefinition;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:42 2019/3/23
 * @Modified By:
 */
public interface FieldDefinitionService {

    List<TFieldDefinition> queryField(Integer satelliteId);
}
