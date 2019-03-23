package com.satellite.system.mapper;

import com.satellite.system.bean.TFieldDefinition;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:41 2019/3/23
 * @Modified By:
 */
public interface FieldDefinitionMapper {

    @Select("select * from field_definition where satellite_id = #{satelliteId}")
    List<TFieldDefinition> getListBySatelliteId(Integer satelliteId);
}
