package com.satellite.system.mapper;

import com.satellite.system.bean.TTaskAllocation;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;


/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 20:26 2019/3/22
 * @Modified By:
 */
public class TaskAllocationSqlProvider {

    public String queryTaskAssignment(TTaskAllocation tTaskAllocation){

        return  new SQL(){
            {
               SELECT("*");
               FROM("task_allocation");
               if(tTaskAllocation.getTaskNumber()!=null){
                   WHERE("task_number=#{taskNumber}");
               }
               if(tTaskAllocation.getSatelliteNumber()!=null){
                   WHERE("satellite_number=#{satelliteNumber}");
               }
               if(StringUtils.isNotBlank(tTaskAllocation.getStationNumber())){
                   WHERE("station_number=#{stationNumber}");
               }
            }
        }.toString();

    }
}
