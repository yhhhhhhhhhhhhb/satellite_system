package com.satellite.system.mapper;

import com.satellite.system.bean.TGroundStationInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:37 2019/3/23
 * @Modified By:
 */
public interface GroundStationInfoMapper {

    @Select("select * from ground_station_info")
    List<TGroundStationInfo> getAllInfo();

    @Insert("inser info ground_station_info(number,name,type,telemetry_frequency,telemetry_gain,remote_control_frequency,remote_erp_value,data_downlink_frequency,data_downlink_gain,data_uplink_frequency,data_uplink_erp_value,longitude,latitude,address)")
    Integer addGroundStationInfo(TGroundStationInfo tGroundStationInfo);

    @Delete("delete from ground_station_info where number = #{groundId}")
    Integer deleteGroundStationInfo(String groundId);

    @Update("update ground_station_info set ()")
    Integer updateGroundStationInfo(TGroundStationInfo tGroundStationInfo);
}
