package com.satellite.system.mapper;

import com.satellite.system.bean.TConstellationInfo;
import com.satellite.system.bean.TSatelliteInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 17:24 2019/3/23
 * @Modified By:
 */
@Mapper
public interface ConstellationInfoMapper {

    @Select("select * from constellation_info")
    List<TConstellationInfo> getAllInfo();

    @Select("select * from constellation_info where number = #{number}")
    List<TConstellationInfo> getListById(String number);

    @Insert("insert into constellation_info(number,name,type,belone_people) values (#{number},#{name},#{type},#{belone_people})")
    Integer addConstellationInfo(TConstellationInfo constellationInfo);

    @Delete("delete from constellation_info where number = #{satelliteId}")
    Integer deleteConstellationInfo(String satelliteId);

    @Update("update constellation_info set name = #{name},type=#{type},belone_people = #{belone_people} where number= #{number}")
    Integer updateConstellationInfo(TConstellationInfo satelliteInfo);
}
