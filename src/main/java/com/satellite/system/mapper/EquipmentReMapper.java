package com.satellite.system.mapper;

import com.satellite.system.bean.TEquipmentRe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 11:28 2019/3/23
 * @Modified By:
 */
@Mapper
public interface EquipmentReMapper {


    @Select("select * from equipment_re where satellite_id = #{satelliteId}")
    List<TEquipmentRe> queryDeviceRelation(Integer satelliteId);
}
