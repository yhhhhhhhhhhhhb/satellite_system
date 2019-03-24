package com.satellite.system.service.impl;

import com.satellite.system.bean.TFieldDefinition;
import com.satellite.system.mapper.FieldDefinitionMapper;
import com.satellite.system.service.FieldDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:42 2019/3/23
 * @Modified By:
 */
@Service
public class FieldDefinitionServiceImpl implements FieldDefinitionService{

    @Autowired
    FieldDefinitionMapper fieldDefinitionMapper;

    @Override
    public List<TFieldDefinition> queryField(Integer satelliteId){
        List<TFieldDefinition> list = fieldDefinitionMapper.getListBySatelliteId(satelliteId);
        return list;
    }

}
