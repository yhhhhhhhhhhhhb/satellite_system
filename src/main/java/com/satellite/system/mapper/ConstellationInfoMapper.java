package com.satellite.system.mapper;

import com.satellite.system.bean.TConstellationInfo;
import com.satellite.system.bean.TSatelliteInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 17:24 2019/3/23
 * @Modified By:
 */
public interface ConstellationInfoMapper {

    @Select("select * from constellation_info")
    List<TConstellationInfo> getAllInfo();

    @Select("select * from constellation_info where number = #{number}")
    List<TConstellationInfo> getListById(String number);

    @Insert("")
    Integer addConstellationInfo(TConstellationInfo constellationInfo);

    @Delete("delete from constellation_info where number = #{satelliteId}")
    Integer deleteConstellationInfo(String satelliteId);

    @Update("")
    Integer updateConstellationInfo(TConstellationInfo satelliteInfo);
}
