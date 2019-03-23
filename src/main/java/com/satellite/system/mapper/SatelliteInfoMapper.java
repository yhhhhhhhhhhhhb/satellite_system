package com.satellite.system.mapper;

import com.satellite.system.bean.TSatelliteInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:15 2019/3/23
 * @Modified By:
 */
public interface SatelliteInfoMapper {


    @Select("select * from satellite_info a left join task_allocation b on a.id = b.satellite_number where b.task_number in (#{ids}) ")
    List<TSatelliteInfo> getDownListByTaskId(String ids);

    @Select("select * from satellite_info")
    List<TSatelliteInfo> getAllInfo();

    @Insert("")
    Integer addSatellilte(TSatelliteInfo satelliteInfo);

    @Delete("delete from satellite_info where number = #{satelliteId}")
    Integer deleteSatellite(String satelliteId);

    @Update("")
    Integer updateSatellilte(TSatelliteInfo satelliteInfo);

    @Select("select * from satellite_info where constellation_number = #{constellationId}")
    List<TSatelliteInfo> getAllSatellitesBycon(String constellationId);
}
