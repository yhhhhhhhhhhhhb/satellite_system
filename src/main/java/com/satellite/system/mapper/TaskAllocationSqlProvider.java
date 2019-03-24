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
               if(tTaskAllocation.getId()!=null){
                   WHERE("id=#{id}");
               }
               if(tTaskAllocation.getSatellite_number()!=null){
                   WHERE("satellite_number=#{satellite_number}");
               }
               if(tTaskAllocation.getTask_number()!=null){
                   WHERE("task_type = #{task_type}");
               }
               if(StringUtils.isNotBlank(tTaskAllocation.getStation_number())){
                   WHERE("station_number=#{station_number}");
               }
            }
        }.toString();

    }
}
