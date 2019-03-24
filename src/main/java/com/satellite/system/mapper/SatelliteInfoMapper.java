package com.satellite.system.mapper;

import com.satellite.system.bean.TSatelliteInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:15 2019/3/23
 * @Modified By:
 */
@Mapper
public interface SatelliteInfoMapper {


    @Select("select * from satellite_info a left join task_allocation b on a.id = b.satellite_number where b.id in (${ids}) ")
    List<TSatelliteInfo> getDownListByTaskId(@Param("ids") String ids);

    @Select("select * from satellite_info")
    List<TSatelliteInfo> getAllInfo();

    @Insert("insert into satellite_info( number,nasa_number,name,constellation_number,type,telemetry_frequency,telemetry_erp_value,remote_frequency,remote_receiving_gain,data_downlink,erp_value,data_uplink_frequency,data_uplink_receive_gain,business_downlink_frequency,business_downlink_erp_value,business_uplink_frequency,service_uplink_receive_gain,inclination,ascending_point,eccentricity,semi_long_axis,perigee_angular_distance) values (#{number},#{nasa_number},#{name},#{constellation_number},#{type},#{telemetry_frequency},#{telemetry_erp_value},#{remote_frequency},#{remote_receiving_gain},#{data_downlink},#{erp_value},#{data_uplink_frequency},#{data_uplink_receive_gain},#{business_downlink_frequency},#{business_downlink_erp_value},#{business_uplink_frequency},#{service_uplink_receive_gain},#{inclination},#{ascending_point},#{eccentricity},#{semi_long_axis},#{perigee_angular_distance})")
    Integer addSatellilte(TSatelliteInfo satelliteInfo);

    @Delete("delete from satellite_info where number = #{satelliteId}")
    Integer deleteSatellite(String satelliteId);

    @Update("update satellite_info set nasa_number=#{nasa_number},name=#{name},constellation_number =#{constellation_number},type=#{type},telemetry_frequency=#{telemetry_frequency},telemetry_erp_value=#{telemetry_erp_value},remote_frequency=#{remote_frequency},remote_receiving_gain=#{remote_receiving_gain},data_downlink=#{data_downlink#},erp_value=#{erp_value},data_uplink_frequency=#{data_uplink_frequency},data_uplink_receive_gain=#{data_uplink_receive_gain},business_downlink_frequency=#{business_downlink_frequency},business_downlink_erp_value=#{business_downlink_erp_value},business_uplink_frequency=#{business_uplink_frequency},service_uplink_receive_gain=#{service_uplink_receive_gain},inclination=#{inclination},ascending_point=#{ascending_point},eccentricity=#{eccentricity},semi_long_axis=#{semi_long_axis},perigee_angular_distance=#{perigee_angular_distance} where number = #{number}")
    Integer updateSatellilte(TSatelliteInfo satelliteInfo);

    @Select("select * from satellite_info where constellation_number = #{constellationId}")
    List<TSatelliteInfo> getAllSatellitesBycon(String constellationId);
}
